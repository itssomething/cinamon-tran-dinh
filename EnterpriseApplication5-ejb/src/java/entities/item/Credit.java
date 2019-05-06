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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Credit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Credit.findAll", query = "SELECT c FROM Credit c")
    , @NamedQuery(name = "Credit.findById", query = "SELECT c FROM Credit c WHERE c.id = :id")})
public class Credit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "AuthorAuthorID", referencedColumnName = "AuthorID")
    @ManyToOne(optional = false)
    private Author authorAuthorID;
    @JoinColumn(name = "BookProductProductID", referencedColumnName = "ProductProductID")
    @ManyToOne(optional = false)
    private Book bookProductProductID;

    public Credit() {
    }

    public Credit(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Author getAuthorAuthorID() {
        return authorAuthorID;
    }

    public void setAuthorAuthorID(Author authorAuthorID) {
        this.authorAuthorID = authorAuthorID;
    }

    public Book getBookProductProductID() {
        return bookProductProductID;
    }

    public void setBookProductProductID(Book bookProductProductID) {
        this.bookProductProductID = bookProductProductID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credit)) {
            return false;
        }
        Credit other = (Credit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Credit[ id=" + id + " ]";
    }
    
}
