/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.payment;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "PaymentMethod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentMethod.findAll", query = "SELECT p FROM PaymentMethod p")
    , @NamedQuery(name = "PaymentMethod.findByPMethodID", query = "SELECT p FROM PaymentMethod p WHERE p.pMethodID = :pMethodID")})
public class PaymentMethod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PMethodID")
    private Integer pMethodID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentMethodPMethodID")
    private List<Order> order1List;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentMethod")
    private CoDPayment coDPayment;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentMethod")
    private BankPayment bankPayment;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentMethod")
    private CreditCardPayment creditCardPayment;

    public PaymentMethod() {
    }

    public PaymentMethod(Integer pMethodID) {
        this.pMethodID = pMethodID;
    }

    public Integer getPMethodID() {
        return pMethodID;
    }

    public void setPMethodID(Integer pMethodID) {
        this.pMethodID = pMethodID;
    }

    @XmlTransient
    public List<Order> getOrderList() {
        return order1List;
    }

    public void setOrderList(List<Order> order1List) {
        this.order1List = order1List;
    }

    public CoDPayment getCoDPayment() {
        return coDPayment;
    }

    public void setCoDPayment(CoDPayment coDPayment) {
        this.coDPayment = coDPayment;
    }

    public BankPayment getBankPayment() {
        return bankPayment;
    }

    public void setBankPayment(BankPayment bankPayment) {
        this.bankPayment = bankPayment;
    }

    public CreditCardPayment getCreditCardPayment() {
        return creditCardPayment;
    }

    public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pMethodID != null ? pMethodID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod other = (PaymentMethod) object;
        if ((this.pMethodID == null && other.pMethodID != null) || (this.pMethodID != null && !this.pMethodID.equals(other.pMethodID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PaymentMethod[ pMethodID=" + pMethodID + " ]";
    }
    
}
