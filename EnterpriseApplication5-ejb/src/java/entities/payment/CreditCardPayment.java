/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.payment;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "CreditCardPayment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CreditCardPayment.findAll", query = "SELECT c FROM CreditCardPayment c")
    , @NamedQuery(name = "CreditCardPayment.findByCardNo", query = "SELECT c FROM CreditCardPayment c WHERE c.cardNo = :cardNo")
    , @NamedQuery(name = "CreditCardPayment.findByOwnerName", query = "SELECT c FROM CreditCardPayment c WHERE c.ownerName = :ownerName")
    , @NamedQuery(name = "CreditCardPayment.findByPaymentMethodPMethodID", query = "SELECT c FROM CreditCardPayment c WHERE c.paymentMethodPMethodID = :paymentMethodPMethodID")})
public class CreditCardPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "CardNo")
    private String cardNo;
    @Size(max = 255)
    @Column(name = "OwnerName")
    private String ownerName;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PaymentMethodPMethodID")
    private Integer paymentMethodPMethodID;
    @JoinColumn(name = "PaymentMethodPMethodID", referencedColumnName = "PMethodID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PaymentMethod paymentMethod;

    public CreditCardPayment() {
    }

    public CreditCardPayment(Integer paymentMethodPMethodID) {
        this.paymentMethodPMethodID = paymentMethodPMethodID;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getPaymentMethodPMethodID() {
        return paymentMethodPMethodID;
    }

    public void setPaymentMethodPMethodID(Integer paymentMethodPMethodID) {
        this.paymentMethodPMethodID = paymentMethodPMethodID;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentMethodPMethodID != null ? paymentMethodPMethodID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditCardPayment)) {
            return false;
        }
        CreditCardPayment other = (CreditCardPayment) object;
        if ((this.paymentMethodPMethodID == null && other.paymentMethodPMethodID != null) || (this.paymentMethodPMethodID != null && !this.paymentMethodPMethodID.equals(other.paymentMethodPMethodID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CreditCardPayment[ paymentMethodPMethodID=" + paymentMethodPMethodID + " ]";
    }
    
}
