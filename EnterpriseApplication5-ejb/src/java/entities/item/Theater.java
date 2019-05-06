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
@Table(name = "Theater")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Theater.findAll", query = "SELECT t FROM Theater t")
    , @NamedQuery(name = "Theater.findByTheaterID", query = "SELECT t FROM Theater t WHERE t.theaterID = :theaterID")
    , @NamedQuery(name = "Theater.findByName", query = "SELECT t FROM Theater t WHERE t.name = :name")
    , @NamedQuery(name = "Theater.findByAddress", query = "SELECT t FROM Theater t WHERE t.address = :address")})
public class Theater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TheaterID")
    private Integer theaterID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theaterTheaterID")
    private List<MovieTicket> movieTicketList;

    public Theater() {
    }

    public Theater(Integer theaterID) {
        this.theaterID = theaterID;
    }

    public Integer getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(Integer theaterID) {
        this.theaterID = theaterID;
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
    public List<MovieTicket> getMovieTicketList() {
        return movieTicketList;
    }

    public void setMovieTicketList(List<MovieTicket> movieTicketList) {
        this.movieTicketList = movieTicketList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterID != null ? theaterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theater)) {
            return false;
        }
        Theater other = (Theater) object;
        if ((this.theaterID == null && other.theaterID != null) || (this.theaterID != null && !this.theaterID.equals(other.theaterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Theater[ theaterID=" + theaterID + " ]";
    }
    
}
