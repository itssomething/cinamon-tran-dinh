/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.storage;

import entities.item.Product;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "ImportStorageBill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImportStorageBill.findAll", query = "SELECT i FROM ImportStorageBill i")
    , @NamedQuery(name = "ImportStorageBill.findByImportBillID", query = "SELECT i FROM ImportStorageBill i WHERE i.importBillID = :importBillID")
    , @NamedQuery(name = "ImportStorageBill.findByTime", query = "SELECT i FROM ImportStorageBill i WHERE i.time = :time")
    , @NamedQuery(name = "ImportStorageBill.findByTotalMoney", query = "SELECT i FROM ImportStorageBill i WHERE i.totalMoney = :totalMoney")})
public class ImportStorageBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ImportBillID")
    private Integer importBillID;
    @Column(name = "Time")
    private Integer time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalMoney")
    private float totalMoney;
    @JoinColumn(name = "ProviderProviderID", referencedColumnName = "ProviderID")
    @ManyToOne(optional = false)
    private Provider providerProviderID;
    @JoinColumn(name = "StorageStorageID", referencedColumnName = "StorageID")
    @ManyToOne(optional = false)
    private Storage storageStorageID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "importStorageBillImportBillID")
    private List<Product> productList;

    public ImportStorageBill() {
    }

    public ImportStorageBill(Integer importBillID) {
        this.importBillID = importBillID;
    }

    public ImportStorageBill(Integer importBillID, float totalMoney) {
        this.importBillID = importBillID;
        this.totalMoney = totalMoney;
    }

    public Integer getImportBillID() {
        return importBillID;
    }

    public void setImportBillID(Integer importBillID) {
        this.importBillID = importBillID;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Provider getProviderProviderID() {
        return providerProviderID;
    }

    public void setProviderProviderID(Provider providerProviderID) {
        this.providerProviderID = providerProviderID;
    }

    public Storage getStorageStorageID() {
        return storageStorageID;
    }

    public void setStorageStorageID(Storage storageStorageID) {
        this.storageStorageID = storageStorageID;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (importBillID != null ? importBillID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportStorageBill)) {
            return false;
        }
        ImportStorageBill other = (ImportStorageBill) object;
        if ((this.importBillID == null && other.importBillID != null) || (this.importBillID != null && !this.importBillID.equals(other.importBillID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ImportStorageBill[ importBillID=" + importBillID + " ]";
    }
    
}
