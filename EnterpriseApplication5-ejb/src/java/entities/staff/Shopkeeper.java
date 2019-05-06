/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.staff;

import entities.purchase_system.Bill;
import entities.purchase_system.Shop;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Shopkeeper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shopkeeper.findAll", query = "SELECT s FROM Shopkeeper s")
    , @NamedQuery(name = "Shopkeeper.findByEmployeeEmployeeID", query = "SELECT s FROM Shopkeeper s WHERE s.employeeEmployeeID = :employeeEmployeeID")})
public class Shopkeeper implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeEmployeeID")
    private Integer employeeEmployeeID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shopkeeperEmployeeEmployeeID")
    private List<Bill> billList;
    @JoinColumn(name = "EmployeeEmployeeID", referencedColumnName = "EmployeeID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;
    @JoinColumn(name = "ShopShopID", referencedColumnName = "ShopID")
    @ManyToOne(optional = false)
    private Shop shopShopID;

    public Shopkeeper() {
    }

    public Shopkeeper(Integer employeeEmployeeID) {
        this.employeeEmployeeID = employeeEmployeeID;
    }

    public Integer getEmployeeEmployeeID() {
        return employeeEmployeeID;
    }

    public void setEmployeeEmployeeID(Integer employeeEmployeeID) {
        this.employeeEmployeeID = employeeEmployeeID;
    }

    @XmlTransient
    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Shop getShopShopID() {
        return shopShopID;
    }

    public void setShopShopID(Shop shopShopID) {
        this.shopShopID = shopShopID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeEmployeeID != null ? employeeEmployeeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shopkeeper)) {
            return false;
        }
        Shopkeeper other = (Shopkeeper) object;
        if ((this.employeeEmployeeID == null && other.employeeEmployeeID != null) || (this.employeeEmployeeID != null && !this.employeeEmployeeID.equals(other.employeeEmployeeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Shopkeeper[ employeeEmployeeID=" + employeeEmployeeID + " ]";
    }
    
}
