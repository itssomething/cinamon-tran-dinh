/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

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
@Table(name = "Discount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discount.findAll", query = "SELECT d FROM Discount d")
    , @NamedQuery(name = "Discount.findByDiscountID", query = "SELECT d FROM Discount d WHERE d.discountID = :discountID")
    , @NamedQuery(name = "Discount.findByRatio", query = "SELECT d FROM Discount d WHERE d.ratio = :ratio")
//    , @NamedQuery(name = "Discount.findFirst", query = "SELECT * FROM Discount LIMIT 1")
})
public class Discount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DiscountID")
    private Integer discountID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Ratio")
    private Float ratio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "discountDiscountID")
    private List<Product> productList;

    public Discount() {
    }

    public Discount(Integer discountID) {
        this.discountID = discountID;
    }

    public Integer getDiscountID() {
        return discountID;
    }

    public void setDiscountID(Integer discountID) {
        this.discountID = discountID;
    }

    public Float getRatio() {
        return ratio;
    }

    public void setRatio(Float ratio) {
        this.ratio = ratio;
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
        hash += (discountID != null ? discountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discount)) {
            return false;
        }
        Discount other = (Discount) object;
        if ((this.discountID == null && other.discountID != null) || (this.discountID != null && !this.discountID.equals(other.discountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Discount[ discountID=" + discountID + " ]";
    }
    
}
