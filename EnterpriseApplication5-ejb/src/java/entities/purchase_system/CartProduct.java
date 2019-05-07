/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.purchase_system;

import entities.customer.Customer;
import entities.item.Product;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author duong
 */
@Entity
@Table(name = "cartproduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CartProduct.findAll", query = "SELECT c FROM CartProduct c")
    , @NamedQuery(name = "CartProduct.findById", query = "SELECT c FROM CartProduct c WHERE c.id = :id")})
public class CartProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "CartCartID", referencedColumnName = "CartID")
    @ManyToOne(optional = false)
    private Cart cartCartID;
    @JoinColumn(name = "CustomerCustomerID", referencedColumnName = "CustomerID")
    @ManyToOne(optional = false)
    private Customer customerCustomerID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Product productProductID;
    @Column(name="Quantity")
    private Integer quantity;
    @Column(name="Status")
    private Integer status;
    @Column(name="OrderOrderID")
    private Integer orderOrderID;

    public CartProduct() {
    }

    public CartProduct(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Product getProductProductID() {
        return productProductID;
    }

    public void setProductProductID(Product productProductID) {
        this.productProductID = productProductID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderOrderID() {
        return orderOrderID;
    }

    public void setOrderOrderID(Integer orderOrderID) {
        this.orderOrderID = orderOrderID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartProduct)) {
            return false;
        }
        CartProduct other = (CartProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CartProduct[ id=" + id + " ]";
    }
    
}
