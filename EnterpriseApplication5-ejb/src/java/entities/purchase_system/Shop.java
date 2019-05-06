/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.purchase_system;

import entities.staff.Shopkeeper;
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
@Table(name = "Shop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shop.findAll", query = "SELECT s FROM Shop s")
    , @NamedQuery(name = "Shop.findByShopID", query = "SELECT s FROM Shop s WHERE s.shopID = :shopID")
    , @NamedQuery(name = "Shop.findByName", query = "SELECT s FROM Shop s WHERE s.name = :name")
    , @NamedQuery(name = "Shop.findByAddress", query = "SELECT s FROM Shop s WHERE s.address = :address")})
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ShopID")
    private Integer shopID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shopShopID")
    private List<Shopkeeper> shopkeeperList;

    public Shop() {
    }

    public Shop(Integer shopID) {
        this.shopID = shopID;
    }

    public Integer getShopID() {
        return shopID;
    }

    public void setShopID(Integer shopID) {
        this.shopID = shopID;
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

    @XmlTransient
    public List<Shopkeeper> getShopkeeperList() {
        return shopkeeperList;
    }

    public void setShopkeeperList(List<Shopkeeper> shopkeeperList) {
        this.shopkeeperList = shopkeeperList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shopID != null ? shopID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shop)) {
            return false;
        }
        Shop other = (Shop) object;
        if ((this.shopID == null && other.shopID != null) || (this.shopID != null && !this.shopID.equals(other.shopID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Shop[ shopID=" + shopID + " ]";
    }
    
}
