/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.attribute;

import entities.customer.Customer;
import entities.staff.Employee;
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
@Table(name = "FullName")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FullName.findAll", query = "SELECT f FROM FullName f")
    , @NamedQuery(name = "FullName.findByFnid", query = "SELECT f FROM FullName f WHERE f.fnid = :fnid")
    , @NamedQuery(name = "FullName.findByFirstName", query = "SELECT f FROM FullName f WHERE f.firstName = :firstName")
    , @NamedQuery(name = "FullName.findByMiddleName", query = "SELECT f FROM FullName f WHERE f.middleName = :middleName")
    , @NamedQuery(name = "FullName.findByLastname", query = "SELECT f FROM FullName f WHERE f.lastname = :lastname")})
public class FullName implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FNID")
    private Integer fnid;
//    @Size(max = 255)
    @Column(name = "FirstName")
    private String firstName;
//    @Size(max = 255)
    @Column(name = "MiddleName")
    private String middleName;
//    @Size(max = 255)
    @Column(name = "Lastname")
    private String lastname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fullNameFNID")
    private List<Customer> customerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fullNameFNID")
    private List<Employee> employeeList;

    public FullName() {
    }

    public FullName(Integer fnid) {
        this.fnid = fnid;
    }

    public Integer getFnid() {
        return fnid;
    }

    public void setFnid(Integer fnid) {
        this.fnid = fnid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @XmlTransient
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @XmlTransient
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fnid != null ? fnid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FullName)) {
            return false;
        }
        FullName other = (FullName) object;
        if ((this.fnid == null && other.fnid != null) || (this.fnid != null && !this.fnid.equals(other.fnid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FullName[ fnid=" + fnid + " ]";
    }
    
}
