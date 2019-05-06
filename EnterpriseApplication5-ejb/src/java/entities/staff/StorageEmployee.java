/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.staff;

import entities.storage.Storage;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "StorageEmployee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StorageEmployee.findAll", query = "SELECT s FROM StorageEmployee s")
    , @NamedQuery(name = "StorageEmployee.findByEmployeeEmployeeID", query = "SELECT s FROM StorageEmployee s WHERE s.employeeEmployeeID = :employeeEmployeeID")})
public class StorageEmployee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeEmployeeID")
    private Integer employeeEmployeeID;
    @JoinColumn(name = "EmployeeEmployeeID", referencedColumnName = "EmployeeID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;
    @JoinColumn(name = "StorageStorageID", referencedColumnName = "StorageID")
    @ManyToOne(optional = false)
    private Storage storageStorageID;

    public StorageEmployee() {
    }

    public StorageEmployee(Integer employeeEmployeeID) {
        this.employeeEmployeeID = employeeEmployeeID;
    }

    public Integer getEmployeeEmployeeID() {
        return employeeEmployeeID;
    }

    public void setEmployeeEmployeeID(Integer employeeEmployeeID) {
        this.employeeEmployeeID = employeeEmployeeID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        hash += (employeeEmployeeID != null ? employeeEmployeeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StorageEmployee)) {
            return false;
        }
        StorageEmployee other = (StorageEmployee) object;
        if ((this.employeeEmployeeID == null && other.employeeEmployeeID != null) || (this.employeeEmployeeID != null && !this.employeeEmployeeID.equals(other.employeeEmployeeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.StorageEmployee[ employeeEmployeeID=" + employeeEmployeeID + " ]";
    }
    
}
