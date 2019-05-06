/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.purchase_system;

import entities.item.Product;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "cart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cart.findAll", query = "SELECT c FROM Cart c")
    , @NamedQuery(name = "Cart.findByCartID", query = "SELECT c FROM Cart c WHERE c.cartID = :cartID")
    , @NamedQuery(name = "Cart.findByQuantity", query = "SELECT c FROM Cart c WHERE c.quantity = :quantity")
    , @NamedQuery(name = "Cart.findByMoney", query = "SELECT c FROM Cart c WHERE c.money = :money")
    , @NamedQuery(name = "Cart.findByAmount", query = "SELECT c FROM Cart c WHERE c.amount = :amount")})
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CartID")
    private Integer cartID;
    @Column(name = "Quantity")
    private Integer quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Money")
    private Float money;
    @Column(name = "Amount")
    private Integer amount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartCartID")
    private List<CartProduct> cartProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartCartID")
    private List<Order> orderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartCartID")
    private List<Product> productList;

    public Cart() {
    }

    public Cart(Integer cartID) {
        this.cartID = cartID;
    }

    public Integer getCartID() {
        return cartID;
    }

    public void setCartID(Integer cartID) {
        this.cartID = cartID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @XmlTransient
    public List<CartProduct> getCartProductList() {
        return cartProductList;
    }

    public void setCartProductList(List<CartProduct> cartProductList) {
        this.cartProductList = cartProductList;
    }

    @XmlTransient
    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartID != null ? cartID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cart)) {
            return false;
        }
        Cart other = (Cart) object;
        if ((this.cartID == null && other.cartID != null) || (this.cartID != null && !this.cartID.equals(other.cartID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cart[ cartID=" + cartID + " ]";
    }
    
}

