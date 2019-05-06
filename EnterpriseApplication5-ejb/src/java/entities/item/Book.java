/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

import entities.item.Publisher;
import entities.item.Credit;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Book")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
    , @NamedQuery(name = "Book.findByPublicDate", query = "SELECT b FROM Book b WHERE b.publicDate = :publicDate")
    , @NamedQuery(name = "Book.findByProductProductID", query = "SELECT b FROM Book b WHERE b.productProductID = :productProductID")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "PublicDate")
    private Integer publicDate;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PublisherPublsiherID", referencedColumnName = "PublsiherID")
    @ManyToOne(optional = false)
    private Publisher publisherPublsiherID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookProductProductID")
    private List<Credit> creditList;

    public Book() {
    }

    public Book(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Integer getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Integer publicDate) {
        this.publicDate = publicDate;
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

    public Publisher getPublisherPublsiherID() {
        return publisherPublsiherID;
    }

    public void setPublisherPublsiherID(Publisher publisherPublsiherID) {
        this.publisherPublsiherID = publisherPublsiherID;
    }

    @XmlTransient
    public List<Credit> getCreditList() {
        return creditList;
    }

    public void setCreditList(List<Credit> creditList) {
        this.creditList = creditList;
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
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Book[ productProductID=" + productProductID + " ]";
    }
    
}
