/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.shipping;

import entities.purchase_system.Order;
import entities.staff.Shipper;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Shipping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipping.findAll", query = "SELECT s FROM Shipping s")
    , @NamedQuery(name = "Shipping.findByShippingID", query = "SELECT s FROM Shipping s WHERE s.shippingID = :shippingID")
    , @NamedQuery(name = "Shipping.findByRegionCode", query = "SELECT s FROM Shipping s WHERE s.regionCode = :regionCode")
    , @NamedQuery(name = "Shipping.findByCost", query = "SELECT s FROM Shipping s WHERE s.cost = :cost")
    , @NamedQuery(name = "Shipping.findByShippingDate", query = "SELECT s FROM Shipping s WHERE s.shippingDate = :shippingDate")})
public class Shipping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ShippingID")
    private Integer shippingID;
    @Column(name = "RegionCode")
    private Integer regionCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Cost")
    private Float cost;
    @Column(name = "ShippingDate")
    private Integer shippingDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shippingShippingID")
    private List<Order> order1List;
    @JoinColumn(name = "ShipperEmployeeEmployeeID", referencedColumnName = "EmployeeEmployeeID")
    @ManyToOne(optional = false)
    private Shipper shipperEmployeeEmployeeID;
    @JoinColumn(name = "ShippingStatusStatusID", referencedColumnName = "StatusID")
    @ManyToOne(optional = false)
    private ShippingStatus shippingStatusStatusID;
    @JoinColumn(name = "ShippingTypeShipTypeID", referencedColumnName = "ShipTypeID")
    @ManyToOne(optional = false)
    private ShippingType shippingTypeShipTypeID;
    @JoinColumn(name = "VehicleVehicleID", referencedColumnName = "VehicleID")
    @ManyToOne(optional = false)
    private Vehicle vehicleVehicleID;

    public Shipping() {
    }

    public Shipping(Integer shippingID) {
        this.shippingID = shippingID;
    }

    public Integer getShippingID() {
        return shippingID;
    }

    public void setShippingID(Integer shippingID) {
        this.shippingID = shippingID;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Integer shippingDate) {
        this.shippingDate = shippingDate;
    }

    @XmlTransient
    public List<Order> getOrderList() {
        return order1List;
    }

    public void setOrderList(List<Order> order1List) {
        this.order1List = order1List;
    }

    public Shipper getShipperEmployeeEmployeeID() {
        return shipperEmployeeEmployeeID;
    }

    public void setShipperEmployeeEmployeeID(Shipper shipperEmployeeEmployeeID) {
        this.shipperEmployeeEmployeeID = shipperEmployeeEmployeeID;
    }

    public ShippingStatus getShippingStatusStatusID() {
        return shippingStatusStatusID;
    }

    public void setShippingStatusStatusID(ShippingStatus shippingStatusStatusID) {
        this.shippingStatusStatusID = shippingStatusStatusID;
    }

    public ShippingType getShippingTypeShipTypeID() {
        return shippingTypeShipTypeID;
    }

    public void setShippingTypeShipTypeID(ShippingType shippingTypeShipTypeID) {
        this.shippingTypeShipTypeID = shippingTypeShipTypeID;
    }

    public Vehicle getVehicleVehicleID() {
        return vehicleVehicleID;
    }

    public void setVehicleVehicleID(Vehicle vehicleVehicleID) {
        this.vehicleVehicleID = vehicleVehicleID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shippingID != null ? shippingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipping)) {
            return false;
        }
        Shipping other = (Shipping) object;
        if ((this.shippingID == null && other.shippingID != null) || (this.shippingID != null && !this.shippingID.equals(other.shippingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Shipping[ shippingID=" + shippingID + " ]";
    }
    
}
