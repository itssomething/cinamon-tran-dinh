/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.attribute;

import entities.customer.Customer;
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
@Table(name = "Phone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phone.findAll", query = "SELECT p FROM Phone p")
    , @NamedQuery(name = "Phone.findByPhoneID", query = "SELECT p FROM Phone p WHERE p.phoneID = :phoneID")
    , @NamedQuery(name = "Phone.findBySectionCode", query = "SELECT p FROM Phone p WHERE p.sectionCode = :sectionCode")
    , @NamedQuery(name = "Phone.findByPhonenumber", query = "SELECT p FROM Phone p WHERE p.phonenumber = :phonenumber")})
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PhoneID")
    private Integer phoneID;
    @Size(max = 255)
    @Column(name = "SectionCode")
    private String sectionCode;
    @Size(max = 255)
    @Column(name = "Phonenumber")
    private String phonenumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "phonePhoneID")
    private List<Customer> customerList;

    public Phone() {
    }

    public Phone(Integer phoneID) {
        this.phoneID = phoneID;
    }

    public Integer getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(Integer phoneID) {
        this.phoneID = phoneID;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @XmlTransient
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phoneID != null ? phoneID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phone)) {
            return false;
        }
        Phone other = (Phone) object;
        if ((this.phoneID == null && other.phoneID != null) || (this.phoneID != null && !this.phoneID.equals(other.phoneID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Phone[ phoneID=" + phoneID + " ]";
    }
    
}
