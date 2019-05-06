/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.storage;

import entities.staff.StorageEmployee;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Storage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Storage.findAll", query = "SELECT s FROM Storage s")
    , @NamedQuery(name = "Storage.findByStorageID", query = "SELECT s FROM Storage s WHERE s.storageID = :storageID")
    , @NamedQuery(name = "Storage.findByName", query = "SELECT s FROM Storage s WHERE s.name = :name")
    , @NamedQuery(name = "Storage.findByAddress", query = "SELECT s FROM Storage s WHERE s.address = :address")})
public class Storage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "StorageID")
    private Integer storageID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storageStorageID")
    private List<ImportStorageBill> importStorageBillList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storageStorageID")
    private List<StorageEmployee> storageEmployeeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storageStorageID")
    private List<ExportStorageBill> exportStorageBillList;

    public Storage() {
    }

    public Storage(Integer storageID) {
        this.storageID = storageID;
    }

    public Integer getStorageID() {
        return storageID;
    }

    public void setStorageID(Integer storageID) {
        this.storageID = storageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlTransient
    public List<ImportStorageBill> getImportStorageBillList() {
        return importStorageBillList;
    }

    public void setImportStorageBillList(List<ImportStorageBill> importStorageBillList) {
        this.importStorageBillList = importStorageBillList;
    }

    @XmlTransient
    public List<StorageEmployee> getStorageEmployeeList() {
        return storageEmployeeList;
    }

    public void setStorageEmployeeList(List<StorageEmployee> storageEmployeeList) {
        this.storageEmployeeList = storageEmployeeList;
    }

    @XmlTransient
    public List<ExportStorageBill> getExportStorageBillList() {
        return exportStorageBillList;
    }

    public void setExportStorageBillList(List<ExportStorageBill> exportStorageBillList) {
        this.exportStorageBillList = exportStorageBillList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storageID != null ? storageID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Storage)) {
            return false;
        }
        Storage other = (Storage) object;
        if ((this.storageID == null && other.storageID != null) || (this.storageID != null && !this.storageID.equals(other.storageID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Storage[ storageID=" + storageID + " ]";
    }
    
}
