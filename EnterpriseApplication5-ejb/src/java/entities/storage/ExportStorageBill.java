/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.storage;

import entities.purchase_system.Bill;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "ExportStorageBill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExportStorageBill.findAll", query = "SELECT e FROM ExportStorageBill e")
    , @NamedQuery(name = "ExportStorageBill.findByExportBillID", query = "SELECT e FROM ExportStorageBill e WHERE e.exportBillID = :exportBillID")
    , @NamedQuery(name = "ExportStorageBill.findByTime", query = "SELECT e FROM ExportStorageBill e WHERE e.time = :time")
    , @NamedQuery(name = "ExportStorageBill.findByTotalMoney", query = "SELECT e FROM ExportStorageBill e WHERE e.totalMoney = :totalMoney")})
public class ExportStorageBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ExportBillID")
    private Integer exportBillID;
    @Column(name = "Time")
    private Integer time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalMoney")
    private float totalMoney;
    @JoinColumn(name = "BillBillID", referencedColumnName = "BillID")
    @ManyToOne(optional = false)
    private Bill billBillID;
    @JoinColumn(name = "StorageStorageID", referencedColumnName = "StorageID")
    @ManyToOne(optional = false)
    private Storage storageStorageID;

    public ExportStorageBill() {
    }

    public ExportStorageBill(Integer exportBillID) {
        this.exportBillID = exportBillID;
    }

    public ExportStorageBill(Integer exportBillID, float totalMoney) {
        this.exportBillID = exportBillID;
        this.totalMoney = totalMoney;
    }

    public Integer getExportBillID() {
        return exportBillID;
    }

    public void setExportBillID(Integer exportBillID) {
        this.exportBillID = exportBillID;
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

    public Bill getBillBillID() {
        return billBillID;
    }

    public void setBillBillID(Bill billBillID) {
        this.billBillID = billBillID;
    }

    public Storage getStorageStorageID() {
        return storageStorageID;
    }

    public void setStorageStorageID(Storage storageStorageID) {
        this.storageStorageID = storageStorageID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exportBillID != null ? exportBillID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExportStorageBill)) {
            return false;
        }
        ExportStorageBill other = (ExportStorageBill) object;
        if ((this.exportBillID == null && other.exportBillID != null) || (this.exportBillID != null && !this.exportBillID.equals(other.exportBillID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ExportStorageBill[ exportBillID=" + exportBillID + " ]";
    }
    
}
