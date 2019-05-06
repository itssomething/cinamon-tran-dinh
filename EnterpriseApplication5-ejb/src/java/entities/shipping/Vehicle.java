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
@Table(name = "Vehicle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
    , @NamedQuery(name = "Vehicle.findByVehicleID", query = "SELECT v FROM Vehicle v WHERE v.vehicleID = :vehicleID")
    , @NamedQuery(name = "Vehicle.findByName", query = "SELECT v FROM Vehicle v WHERE v.name = :name")})
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VehicleID")
    private Integer vehicleID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicleVehicleID")
    private List<Shipping> shippingList;

    public Vehicle() {
    }

    public Vehicle(Integer vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Integer getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Integer vehicleID) {
        this.vehicleID = vehicleID;
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
        hash += (vehicleID != null ? vehicleID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.vehicleID == null && other.vehicleID != null) || (this.vehicleID != null && !this.vehicleID.equals(other.vehicleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vehicle[ vehicleID=" + vehicleID + " ]";
    }
    
}
