/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.customer;

import entities.item.ProductStat;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Feedback")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feedback.findAll", query = "SELECT f FROM Feedback f")
    , @NamedQuery(name = "Feedback.findByFeedbackID", query = "SELECT f FROM Feedback f WHERE f.feedbackID = :feedbackID")
    , @NamedQuery(name = "Feedback.findByDescription", query = "SELECT f FROM Feedback f WHERE f.description = :description")
    , @NamedQuery(name = "Feedback.findByStar", query = "SELECT f FROM Feedback f WHERE f.star = :star")})
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FeedbackID")
    private Integer feedbackID;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Column(name = "Star")
    private Integer star;
    @JoinColumn(name = "CustomerCustomerID", referencedColumnName = "CustomerID")
    @ManyToOne(optional = false)
    private Customer customerCustomerID;
    @JoinColumn(name = "ProductStatProductProductID", referencedColumnName = "ProductProductID")
    @ManyToOne(optional = false)
    private ProductStat productStatProductProductID;

    public Feedback() {
    }

    public Feedback(Integer feedbackID) {
        this.feedbackID = feedbackID;
    }

    public Integer getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(Integer feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Customer getCustomerCustomerID() {
        return customerCustomerID;
    }

    public void setCustomerCustomerID(Customer customerCustomerID) {
        this.customerCustomerID = customerCustomerID;
    }

    public ProductStat getProductStatProductProductID() {
        return productStatProductProductID;
    }

    public void setProductStatProductProductID(ProductStat productStatProductProductID) {
        this.productStatProductProductID = productStatProductProductID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedbackID != null ? feedbackID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedback)) {
            return false;
        }
        Feedback other = (Feedback) object;
        if ((this.feedbackID == null && other.feedbackID != null) || (this.feedbackID != null && !this.feedbackID.equals(other.feedbackID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Feedback[ feedbackID=" + feedbackID + " ]";
    }
    
}
