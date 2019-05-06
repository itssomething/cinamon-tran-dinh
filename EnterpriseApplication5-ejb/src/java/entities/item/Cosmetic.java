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
@Table(name = "Cosmetic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cosmetic.findAll", query = "SELECT c FROM Cosmetic c")
    , @NamedQuery(name = "Cosmetic.findByExp", query = "SELECT c FROM Cosmetic c WHERE c.exp = :exp")
    , @NamedQuery(name = "Cosmetic.findByUses", query = "SELECT c FROM Cosmetic c WHERE c.uses = :uses")
    , @NamedQuery(name = "Cosmetic.findByProductProductID", query = "SELECT c FROM Cosmetic c WHERE c.productProductID = :productProductID")})
public class Cosmetic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Exp")
    private Integer exp;
    @Size(max = 255)
    @Column(name = "Uses")
    private String uses;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Cosmetic() {
    }

    public Cosmetic(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
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
        if (!(object instanceof Cosmetic)) {
            return false;
        }
        Cosmetic other = (Cosmetic) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cosmetic[ productProductID=" + productProductID + " ]";
    }
    
}
