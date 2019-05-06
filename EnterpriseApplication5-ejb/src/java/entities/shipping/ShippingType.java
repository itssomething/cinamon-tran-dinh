/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.shipping;

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
@Table(name = "ShippingType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShippingType.findAll", query = "SELECT s FROM ShippingType s")
    , @NamedQuery(name = "ShippingType.findByShipTypeID", query = "SELECT s FROM ShippingType s WHERE s.shipTypeID = :shipTypeID")
    , @NamedQuery(name = "ShippingType.findByName", query = "SELECT s FROM ShippingType s WHERE s.name = :name")})
public class ShippingType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ShipTypeID")
    private Integer shipTypeID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shippingTypeShipTypeID")
    private List<Shipping> shippingList;

    public ShippingType() {
    }

    public ShippingType(Integer shipTypeID) {
        this.shipTypeID = shipTypeID;
    }

    public Integer getShipTypeID() {
        return shipTypeID;
    }

    public void setShipTypeID(Integer shipTypeID) {
        this.shipTypeID = shipTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Shipping> getShippingList() {
        return shippingList;
    }

    public void setShippingList(List<Shipping> shippingList) {
        this.shippingList = shippingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipTypeID != null ? shipTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingType)) {
            return false;
        }
        ShippingType other = (ShippingType) object;
        if ((this.shipTypeID == null && other.shipTypeID != null) || (this.shipTypeID != null && !this.shipTypeID.equals(other.shipTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ShippingType[ shipTypeID=" + shipTypeID + " ]";
    }
    
}
