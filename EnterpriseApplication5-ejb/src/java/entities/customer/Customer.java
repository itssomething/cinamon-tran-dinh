/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.customer;

import entities.attribute.FullName;
import entities.attribute.Phone;
import entities.attribute.Account;
import entities.attribute.Address;
import entities.purchase_system.Order;
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
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerID", query = "SELECT c FROM Customer c WHERE c.customerID = :customerID")
    , @NamedQuery(name = "Customer.findByPoint", query = "SELECT c FROM Customer c WHERE c.point = :point")
    , @NamedQuery(name = "Customer.findByLevel", query = "SELECT c FROM Customer c WHERE c.level = :level")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CustomerID")
    private Integer customerID;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "Point")
    private int point;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "Level")
    private int level;
    @JoinColumn(name = "AccountAccountID", referencedColumnName = "AccountID")
    @ManyToOne(optional = false)
    private Account accountAccountID;
    @JoinColumn(name = "AddressAddressID", referencedColumnName = "AddressID")
    @ManyToOne(optional = false)
    private Address addressAddressID;
    @JoinColumn(name = "FullNameFNID", referencedColumnName = "FNID")
    @ManyToOne(optional = false)
    private FullName fullNameFNID;
    @JoinColumn(name = "PhonePhoneID", referencedColumnName = "PhoneID")
    @ManyToOne(optional = false)
    private Phone phonePhoneID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerCustomerID")
    private List<Order> order1List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerCustomerID")
    private List<Feedback> feedbackList;

    public Customer() {
    }

    public Customer(Integer customerID) {
        this.customerID = customerID;
    }

    public Customer(Integer customerID, int point, int level) {
        this.customerID = customerID;
        this.point = point;
        this.level = level;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Account getAccountAccountID() {
        return accountAccountID;
    }

    public void setAccountAccountID(Account accountAccountID) {
        this.accountAccountID = accountAccountID;
    }

    public Address getAddressAddressID() {
        return addressAddressID;
    }

    public void setAddressAddressID(Address addressAddressID) {
        this.addressAddressID = addressAddressID;
    }

    public FullName getFullNameFNID() {
        return fullNameFNID;
    }

    public void setFullNameFNID(FullName fullNameFNID) {
        this.fullNameFNID = fullNameFNID;
    }

    public Phone getPhonePhoneID() {
        return phonePhoneID;
    }

    public void setPhonePhoneID(Phone phonePhoneID) {
        this.phonePhoneID = phonePhoneID;
    }

    @XmlTransient
    public List<Order> getOrderList() {
        return order1List;
    }

    public void setOrderList(List<Order> order1List) {
        this.order1List = order1List;
    }

    @XmlTransient
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Customer[ customerID=" + customerID + " ]";
    }
    
}
