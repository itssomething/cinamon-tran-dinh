/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.purchase_system;

import entities.staff.OnlineSale;
import entities.staff.Shopkeeper;
import entities.storage.ExportStorageBill;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b")
    , @NamedQuery(name = "Bill.findByBillID", query = "SELECT b FROM Bill b WHERE b.billID = :billID")
    , @NamedQuery(name = "Bill.findByTime", query = "SELECT b FROM Bill b WHERE b.time = :time")
    , @NamedQuery(name = "Bill.findByCash", query = "SELECT b FROM Bill b WHERE b.cash = :cash")
    , @NamedQuery(name = "Bill.findByPaymentMethod", query = "SELECT b FROM Bill b WHERE b.paymentMethod = :paymentMethod")
    , @NamedQuery(name = "Bill.findByApplyAmount", query = "SELECT b FROM Bill b WHERE b.applyAmount = :applyAmount")
    , @NamedQuery(name = "Bill.findByChanging", query = "SELECT b FROM Bill b WHERE b.changing = :changing")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BillID")
    private Integer billID;
    @Column(name = "Time")
    private Integer time;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Cash")
    private Float cash;
    @Size(max = 255)
    @Column(name = "PaymentMethod")
    private String paymentMethod;
    @Column(name = "ApplyAmount")
    private Float applyAmount;
    @Column(name = "Changing")
    private Float changing;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billBillID")
    private List<ExportStorageBill> exportStorageBillList;
    @JoinColumn(name = "OnlineSaleEmployeeEmployeeID", referencedColumnName = "EmployeeEmployeeID")
    @ManyToOne(optional = false)
    private OnlineSale onlineSaleEmployeeEmployeeID;
    @JoinColumn(name = "OrderOrderID", referencedColumnName = "OrderID")
    @ManyToOne(optional = false)
    private Order orderOrderID;
    @JoinColumn(name = "ShopkeeperEmployeeEmployeeID", referencedColumnName = "EmployeeEmployeeID")
    @ManyToOne(optional = false)
    private Shopkeeper shopkeeperEmployeeEmployeeID;

    public Bill() {
    }

    public Bill(Integer billID) {
        this.billID = billID;
    }

    public Integer getBillID() {
        return billID;
    }

    public void setBillID(Integer billID) {
        this.billID = billID;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Float getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(Float applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Float getChanging() {
        return changing;
    }

    public void setChanging(Float changing) {
        this.changing = changing;
    }

    @XmlTransient
    public List<ExportStorageBill> getExportStorageBillList() {
        return exportStorageBillList;
    }

    public void setExportStorageBillList(List<ExportStorageBill> exportStorageBillList) {
        this.exportStorageBillList = exportStorageBillList;
    }

    public OnlineSale getOnlineSaleEmployeeEmployeeID() {
        return onlineSaleEmployeeEmployeeID;
    }

    public void setOnlineSaleEmployeeEmployeeID(OnlineSale onlineSaleEmployeeEmployeeID) {
        this.onlineSaleEmployeeEmployeeID = onlineSaleEmployeeEmployeeID;
    }

    public Order getOrderOrderID() {
        return orderOrderID;
    }

    public void setOrderOrderID(Order orderOrderID) {
        this.orderOrderID = orderOrderID;
    }

    public Shopkeeper getShopkeeperEmployeeEmployeeID() {
        return shopkeeperEmployeeEmployeeID;
    }

    public void setShopkeeperEmployeeEmployeeID(Shopkeeper shopkeeperEmployeeEmployeeID) {
        this.shopkeeperEmployeeEmployeeID = shopkeeperEmployeeEmployeeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billID != null ? billID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.billID == null && other.billID != null) || (this.billID != null && !this.billID.equals(other.billID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bill[ billID=" + billID + " ]";
    }
    
}
