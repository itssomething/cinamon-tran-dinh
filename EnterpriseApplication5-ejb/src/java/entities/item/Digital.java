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
@Table(name = "Digital")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Digital.findAll", query = "SELECT d FROM Digital d")
    , @NamedQuery(name = "Digital.findByColor", query = "SELECT d FROM Digital d WHERE d.color = :color")
    , @NamedQuery(name = "Digital.findBySize", query = "SELECT d FROM Digital d WHERE d.size = :size")
    , @NamedQuery(name = "Digital.findByProductProductID", query = "SELECT d FROM Digital d WHERE d.productProductID = :productProductID")})
public class Digital implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Size")
    private int size;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Digital() {
    }

    public Digital(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Digital(Integer productProductID, int size) {
        this.productProductID = productProductID;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        if (!(object instanceof Digital)) {
            return false;
        }
        Digital other = (Digital) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Digital[ productProductID=" + productProductID + " ]";
    }
    
}
