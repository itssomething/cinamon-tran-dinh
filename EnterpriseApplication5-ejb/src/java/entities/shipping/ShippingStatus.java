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
@Table(name = "ShippingStatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShippingStatus.findAll", query = "SELECT s FROM ShippingStatus s")
    , @NamedQuery(name = "ShippingStatus.findByStatusID", query = "SELECT s FROM ShippingStatus s WHERE s.statusID = :statusID")
    , @NamedQuery(name = "ShippingStatus.findByStatus", query = "SELECT s FROM ShippingStatus s WHERE s.status = :status")})
public class ShippingStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "StatusID")
    private Integer statusID;
    @Size(max = 255)
    @Column(name = "Status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shippingStatusStatusID")
    private List<Shipping> shippingList;

    public ShippingStatus() {
    }

    public ShippingStatus(Integer statusID) {
        this.statusID = statusID;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        hash += (statusID != null ? statusID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingStatus)) {
            return false;
        }
        ShippingStatus other = (ShippingStatus) object;
        if ((this.statusID == null && other.statusID != null) || (this.statusID != null && !this.statusID.equals(other.statusID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ShippingStatus[ statusID=" + statusID + " ]";
    }
    
}
