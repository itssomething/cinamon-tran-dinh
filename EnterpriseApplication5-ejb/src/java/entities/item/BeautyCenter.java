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
@Table(name = "BeautyCenter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeautyCenter.findAll", query = "SELECT b FROM BeautyCenter b")
    , @NamedQuery(name = "BeautyCenter.findByBeautyCenterID", query = "SELECT b FROM BeautyCenter b WHERE b.beautyCenterID = :beautyCenterID")
    , @NamedQuery(name = "BeautyCenter.findByName", query = "SELECT b FROM BeautyCenter b WHERE b.name = :name")
    , @NamedQuery(name = "BeautyCenter.findByAddress", query = "SELECT b FROM BeautyCenter b WHERE b.address = :address")})
public class BeautyCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BeautyCenterID")
    private Integer beautyCenterID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "beautyCenterBeautyCenterID")
    private List<BeautyService> beautyServiceList;

    public BeautyCenter() {
    }

    public BeautyCenter(Integer beautyCenterID) {
        this.beautyCenterID = beautyCenterID;
    }

    public Integer getBeautyCenterID() {
        return beautyCenterID;
    }

    public void setBeautyCenterID(Integer beautyCenterID) {
        this.beautyCenterID = beautyCenterID;
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
    public List<BeautyService> getBeautyServiceList() {
        return beautyServiceList;
    }

    public void setBeautyServiceList(List<BeautyService> beautyServiceList) {
        this.beautyServiceList = beautyServiceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (beautyCenterID != null ? beautyCenterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeautyCenter)) {
            return false;
        }
        BeautyCenter other = (BeautyCenter) object;
        if ((this.beautyCenterID == null && other.beautyCenterID != null) || (this.beautyCenterID != null && !this.beautyCenterID.equals(other.beautyCenterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.BeautyCenter[ beautyCenterID=" + beautyCenterID + " ]";
    }
    
}
