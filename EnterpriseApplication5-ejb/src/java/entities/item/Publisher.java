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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Publisher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publisher.findAll", query = "SELECT p FROM Publisher p")
    , @NamedQuery(name = "Publisher.findByPublsiherID", query = "SELECT p FROM Publisher p WHERE p.publsiherID = :publsiherID")
    , @NamedQuery(name = "Publisher.findByName", query = "SELECT p FROM Publisher p WHERE p.name = :name")
    , @NamedQuery(name = "Publisher.findByAddress", query = "SELECT p FROM Publisher p WHERE p.address = :address")
    , @NamedQuery(name = "Publisher.findByPhone", query = "SELECT p FROM Publisher p WHERE p.phone = :phone")})
public class Publisher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PublsiherID")
    private Integer publsiherID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "Phone")
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "publisherPublsiherID")
    private List<Book> bookList;

    public Publisher() {
    }

    public Publisher(Integer publsiherID) {
        this.publsiherID = publsiherID;
    }

    public Integer getPublsiherID() {
        return publsiherID;
    }

    public void setPublsiherID(Integer publsiherID) {
        this.publsiherID = publsiherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlTransient
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (publsiherID != null ? publsiherID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publisher)) {
            return false;
        }
        Publisher other = (Publisher) object;
        if ((this.publsiherID == null && other.publsiherID != null) || (this.publsiherID != null && !this.publsiherID.equals(other.publsiherID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Publisher[ publsiherID=" + publsiherID + " ]";
    }
    
}
