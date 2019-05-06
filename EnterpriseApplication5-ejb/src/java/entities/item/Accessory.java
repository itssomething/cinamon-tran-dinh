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
@Table(name = "Accessory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accessory.findAll", query = "SELECT a FROM Accessory a")
    , @NamedQuery(name = "Accessory.findByMaterial", query = "SELECT a FROM Accessory a WHERE a.material = :material")
    , @NamedQuery(name = "Accessory.findByWeight", query = "SELECT a FROM Accessory a WHERE a.weight = :weight")
    , @NamedQuery(name = "Accessory.findByProductProductID", query = "SELECT a FROM Accessory a WHERE a.productProductID = :productProductID")})
public class Accessory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Material")
    private String material;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Weight")
    private float weight;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Accessory() {
    }

    public Accessory(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Accessory(Integer productProductID, float weight) {
        this.productProductID = productProductID;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
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
        if (!(object instanceof Accessory)) {
            return false;
        }
        Accessory other = (Accessory) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Accessory[ productProductID=" + productProductID + " ]";
    }
    
}
