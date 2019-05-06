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
@Table(name = "Toys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Toys.findAll", query = "SELECT t FROM Toys t")
    , @NamedQuery(name = "Toys.findByAgeLimit", query = "SELECT t FROM Toys t WHERE t.ageLimit = :ageLimit")
    , @NamedQuery(name = "Toys.findByMaterial", query = "SELECT t FROM Toys t WHERE t.material = :material")
    , @NamedQuery(name = "Toys.findByProductProductID", query = "SELECT t FROM Toys t WHERE t.productProductID = :productProductID")})
public class Toys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "AgeLimit")
    private Integer ageLimit;
    @Size(max = 255)
    @Column(name = "Material")
    private String material;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Toys() {
    }

    public Toys(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        if (!(object instanceof Toys)) {
            return false;
        }
        Toys other = (Toys) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Toys[ productProductID=" + productProductID + " ]";
    }
    
}
