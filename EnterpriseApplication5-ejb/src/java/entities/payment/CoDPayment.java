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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "CoDPayment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoDPayment.findAll", query = "SELECT c FROM CoDPayment c")
    , @NamedQuery(name = "CoDPayment.findByFee", query = "SELECT c FROM CoDPayment c WHERE c.fee = :fee")
    , @NamedQuery(name = "CoDPayment.findByPaymentMethodPMethodID", query = "SELECT c FROM CoDPayment c WHERE c.paymentMethodPMethodID = :paymentMethodPMethodID")})
public class CoDPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fee")
    private float fee;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PaymentMethodPMethodID")
    private Integer paymentMethodPMethodID;
    @JoinColumn(name = "PaymentMethodPMethodID", referencedColumnName = "PMethodID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PaymentMethod paymentMethod;

    public CoDPayment() {
    }

    public CoDPayment(Integer paymentMethodPMethodID) {
        this.paymentMethodPMethodID = paymentMethodPMethodID;
    }

    public CoDPayment(Integer paymentMethodPMethodID, float fee) {
        this.paymentMethodPMethodID = paymentMethodPMethodID;
        this.fee = fee;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
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
        if (!(object instanceof CoDPayment)) {
            return false;
        }
        CoDPayment other = (CoDPayment) object;
        if ((this.paymentMethodPMethodID == null && other.paymentMethodPMethodID != null) || (this.paymentMethodPMethodID != null && !this.paymentMethodPMethodID.equals(other.paymentMethodPMethodID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CoDPayment[ paymentMethodPMethodID=" + paymentMethodPMethodID + " ]";
    }
    
}
