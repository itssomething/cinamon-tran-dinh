/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.staff;

import entities.attribute.Account;
import entities.attribute.FullName;
import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findByEmployeeID", query = "SELECT e FROM Employee e WHERE e.employeeID = :employeeID")
    , @NamedQuery(name = "Employee.findByRole", query = "SELECT e FROM Employee e WHERE e.role = :role")
    , @NamedQuery(name = "Employee.findByDepartment", query = "SELECT e FROM Employee e WHERE e.department = :department")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EmployeeID")
    private Integer employeeID;
    @Size(max = 255)
    @Column(name = "Role")
    private String role;
    @Size(max = 255)
    @Column(name = "Department")
    private String department;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private StorageEmployee storageEmployee;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private OnlineSale onlineSale;
    @JoinColumn(name = "AccountAccountID", referencedColumnName = "AccountID")
    @ManyToOne(optional = false)
    private Account accountAccountID;
    @JoinColumn(name = "FullNameFNID", referencedColumnName = "FNID")
    @ManyToOne(optional = false)
    private FullName fullNameFNID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Shopkeeper shopkeeper;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Shipper shipper;

    public Employee() {
    }

    public Employee(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public StorageEmployee getStorageEmployee() {
        return storageEmployee;
    }

    public void setStorageEmployee(StorageEmployee storageEmployee) {
        this.storageEmployee = storageEmployee;
    }

    public OnlineSale getOnlineSale() {
        return onlineSale;
    }

    public void setOnlineSale(OnlineSale onlineSale) {
        this.onlineSale = onlineSale;
    }

    public Account getAccountAccountID() {
        return accountAccountID;
    }

    public void setAccountAccountID(Account accountAccountID) {
        this.accountAccountID = accountAccountID;
    }

    public FullName getFullNameFNID() {
        return fullNameFNID;
    }

    public void setFullNameFNID(FullName fullNameFNID) {
        this.fullNameFNID = fullNameFNID;
    }

    public Shopkeeper getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(Shopkeeper shopkeeper) {
        this.shopkeeper = shopkeeper;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeID != null ? employeeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeID == null && other.employeeID != null) || (this.employeeID != null && !this.employeeID.equals(other.employeeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Employee[ employeeID=" + employeeID + " ]";
    }
    
}
