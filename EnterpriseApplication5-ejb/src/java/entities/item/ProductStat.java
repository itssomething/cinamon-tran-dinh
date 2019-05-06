/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

import entities.customer.Feedback;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "ProductStat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductStat.findAll", query = "SELECT p FROM ProductStat p")
    , @NamedQuery(name = "ProductStat.findByBoughtTime", query = "SELECT p FROM ProductStat p WHERE p.boughtTime = :boughtTime")
    , @NamedQuery(name = "ProductStat.findByProductProductID", query = "SELECT p FROM ProductStat p WHERE p.productProductID = :productProductID")})
public class ProductStat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BoughtTime")
    private int boughtTime;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStatProductProductID")
    private List<Feedback> feedbackList;

    public ProductStat() {
    }

    public ProductStat(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public ProductStat(Integer productProductID, int boughtTime) {
        this.productProductID = productProductID;
        this.boughtTime = boughtTime;
    }

    public int getBoughtTime() {
        return boughtTime;
    }

    public void setBoughtTime(int boughtTime) {
        this.boughtTime = boughtTime;
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

    @XmlTransient
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
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
        if (!(object instanceof ProductStat)) {
            return false;
        }
        ProductStat other = (ProductStat) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductStat[ productProductID=" + productProductID + " ]";
    }
    
}
