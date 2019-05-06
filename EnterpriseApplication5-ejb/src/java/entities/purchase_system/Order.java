/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.purchase_system;

import entities.customer.Customer;
import entities.payment.PaymentMethod;
import entities.shipping.Shipping;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order.findAll", query = "SELECT o FROM Order o")
    , @NamedQuery(name = "Order.findByOrderID", query = "SELECT o FROM Order o WHERE o.orderID = :orderID")
    , @NamedQuery(name = "Order.findByOrderTime", query = "SELECT o FROM Order o WHERE o.orderTime = :orderTime")
    , @NamedQuery(name = "Order.findByStatus", query = "SELECT o FROM Order o WHERE o.status = :status")})
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OrderID")
    private Integer orderID;
    @Column(name = "OrderTime")
    private Integer orderTime;
    @Size(max = 255)
    @Column(name = "Status")
    private String status;
    @JoinColumn(name = "CartCartID", referencedColumnName = "CartID")
    @ManyToOne(optional = false)
    private Cart cartCartID;
    @JoinColumn(name = "CustomerCustomerID", referencedColumnName = "CustomerID")
    @ManyToOne(optional = false)
    private Customer customerCustomerID;
    @JoinColumn(name = "PaymentMethodPMethodID", referencedColumnName = "PMethodID")
    @ManyToOne(optional = false)
    private PaymentMethod paymentMethodPMethodID;
    @JoinColumn(name = "ShippingShippingID", referencedColumnName = "ShippingID")
    @ManyToOne(optional = false)
    private Shipping shippingShippingID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
    private OrderWeb orderWeb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderOrderID")
    private List<Bill> billList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
    private DirectOrder directOrder;

    public Order() {
    }

    public Order(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Integer orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cart getCartCartID() {
        return cartCartID;
    }

    public void setCartCartID(Cart cartCartID) {
        this.cartCartID = cartCartID;
    }

    public Customer getCustomerCustomerID() {
        return customerCustomerID;
    }

    public void setCustomerCustomerID(Customer customerCustomerID) {
        this.customerCustomerID = customerCustomerID;
    }

    public PaymentMethod getPaymentMethodPMethodID() {
        return paymentMethodPMethodID;
    }

    public void setPaymentMethodPMethodID(PaymentMethod paymentMethodPMethodID) {
        this.paymentMethodPMethodID = paymentMethodPMethodID;
    }

    public Shipping getShippingShippingID() {
        return shippingShippingID;
    }

    public void setShippingShippingID(Shipping shippingShippingID) {
        this.shippingShippingID = shippingShippingID;
    }

    public OrderWeb getOrderWeb() {
        return orderWeb;
    }

    public void setOrderWeb(OrderWeb orderWeb) {
        this.orderWeb = orderWeb;
    }

    @XmlTransient
    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public DirectOrder getDirectOrder() {
        return directOrder;
    }

    public void setDirectOrder(DirectOrder directOrder) {
        this.directOrder = directOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order)) {
            return false;
        }
        Order other = (Order) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Order[ orderID=" + orderID + " ]";
    }
    
}
