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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "Film")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Film.findAll", query = "SELECT f FROM Film f")
    , @NamedQuery(name = "Film.findByFilmID", query = "SELECT f FROM Film f WHERE f.filmID = :filmID")
    , @NamedQuery(name = "Film.findByName", query = "SELECT f FROM Film f WHERE f.name = :name")
    , @NamedQuery(name = "Film.findByLength", query = "SELECT f FROM Film f WHERE f.length = :length")})
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FilmID")
    private Integer filmID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Length")
    private int length;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filmFilmID")
    private List<MovieTicket> movieTicketList;

    public Film() {
    }

    public Film(Integer filmID) {
        this.filmID = filmID;
    }

    public Film(Integer filmID, int length) {
        this.filmID = filmID;
        this.length = length;
    }

    public Integer getFilmID() {
        return filmID;
    }

    public void setFilmID(Integer filmID) {
        this.filmID = filmID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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
        hash += (filmID != null ? filmID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.filmID == null && other.filmID != null) || (this.filmID != null && !this.filmID.equals(other.filmID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Film[ filmID=" + filmID + " ]";
    }
    
}
