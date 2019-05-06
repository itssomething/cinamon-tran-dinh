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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Electronic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Electronic.findAll", query = "SELECT e FROM Electronic e")
    , @NamedQuery(name = "Electronic.findByProductivity", query = "SELECT e FROM Electronic e WHERE e.productivity = :productivity")
    , @NamedQuery(name = "Electronic.findByWarranty", query = "SELECT e FROM Electronic e WHERE e.warranty = :warranty")
    , @NamedQuery(name = "Electronic.findByProductProductID", query = "SELECT e FROM Electronic e WHERE e.productProductID = :productProductID")})
public class Electronic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Productivity")
    private Integer productivity;
    @Column(name = "Warranty")
    private Integer warranty;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Electronic() {
    }

    public Electronic(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Integer getProductivity() {
        return productivity;
    }

    public void setProductivity(Integer productivity) {
        this.productivity = productivity;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
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
        if (!(object instanceof Electronic)) {
            return false;
        }
        Electronic other = (Electronic) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Electronic[ productProductID=" + productProductID + " ]";
    }
    
}
