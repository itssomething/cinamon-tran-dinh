/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

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
@Table(name = "Cars")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c")
    , @NamedQuery(name = "Cars.findByFuel", query = "SELECT c FROM Cars c WHERE c.fuel = :fuel")
    , @NamedQuery(name = "Cars.findBySize", query = "SELECT c FROM Cars c WHERE c.size = :size")
    , @NamedQuery(name = "Cars.findByColor", query = "SELECT c FROM Cars c WHERE c.color = :color")
    , @NamedQuery(name = "Cars.findByMotor", query = "SELECT c FROM Cars c WHERE c.motor = :motor")
    , @NamedQuery(name = "Cars.findByProductProductID", query = "SELECT c FROM Cars c WHERE c.productProductID = :productProductID")})
public class Cars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fuel")
    private int fuel;
    @Size(max = 255)
    @Column(name = "Size")
    private String size;
    @Size(max = 255)
    @Column(name = "Color")
    private String color;
    @Size(max = 255)
    @Column(name = "Motor")
    private String motor;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Cars() {
    }

    public Cars(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Cars(Integer productProductID, int fuel) {
        this.productProductID = productProductID;
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getProductProductID() {
        return productProductID;
    }

    public void setProductProductID(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productProductID != null ? productProductID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cars[ productProductID=" + productProductID + " ]";
    }
    
}