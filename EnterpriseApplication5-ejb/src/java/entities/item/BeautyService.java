/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

import entities.item.BeautyCenter;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "BeautyService")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeautyService.findAll", query = "SELECT b FROM BeautyService b")
    , @NamedQuery(name = "BeautyService.findByBodyPart", query = "SELECT b FROM BeautyService b WHERE b.bodyPart = :bodyPart")
    , @NamedQuery(name = "BeautyService.findByExp", query = "SELECT b FROM BeautyService b WHERE b.exp = :exp")
    , @NamedQuery(name = "BeautyService.findByProductProductID", query = "SELECT b FROM BeautyService b WHERE b.productProductID = :productProductID")})
public class BeautyService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "BodyPart")
    private String bodyPart;
    @Column(name = "Exp")
    private Integer exp;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "BeautyCenterBeautyCenterID", referencedColumnName = "BeautyCenterID")
    @ManyToOne(optional = false)
    private BeautyCenter beautyCenterBeautyCenterID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public BeautyService() {
    }

    public BeautyService(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getProductProductID() {
        return productProductID;
    }

    public void setProductProductID(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public BeautyCenter getBeautyCenterBeautyCenterID() {
        return beautyCenterBeautyCenterID;
    }

    public void setBeautyCenterBeautyCenterID(BeautyCenter beautyCenterBeautyCenterID) {
        this.beautyCenterBeautyCenterID = beautyCenterBeautyCenterID;
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
        if (!(object instanceof BeautyService)) {
            return false;
        }
        BeautyService other = (BeautyService) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.BeautyService[ productProductID=" + productProductID + " ]";
    }
    
}
