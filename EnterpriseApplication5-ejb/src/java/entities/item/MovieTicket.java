/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

import entities.item.Product;
import entities.item.Film;
import entities.item.Theater;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "MovieTicket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovieTicket.findAll", query = "SELECT m FROM MovieTicket m")
    , @NamedQuery(name = "MovieTicket.findBySeat", query = "SELECT m FROM MovieTicket m WHERE m.seat = :seat")
    , @NamedQuery(name = "MovieTicket.findByTime", query = "SELECT m FROM MovieTicket m WHERE m.time = :time")
    , @NamedQuery(name = "MovieTicket.findByProductProductID", query = "SELECT m FROM MovieTicket m WHERE m.productProductID = :productProductID")})
public class MovieTicket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Seat")
    private String seat;
    @Column(name = "Time")
    private Integer time;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "FilmFilmID", referencedColumnName = "FilmID")
    @ManyToOne(optional = false)
    private Film filmFilmID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;
    @JoinColumn(name = "TheaterTheaterID", referencedColumnName = "TheaterID")
    @ManyToOne(optional = false)
    private Theater theaterTheaterID;

    public MovieTicket() {
    }

    public MovieTicket(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getProductProductID() {
        return productProductID;
    }

    public void setProductProductID(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Film getFilmFilmID() {
        return filmFilmID;
    }

    public void setFilmFilmID(Film filmFilmID) {
        this.filmFilmID = filmFilmID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Theater getTheaterTheaterID() {
        return theaterTheaterID;
    }

    public void setTheaterTheaterID(Theater theaterTheaterID) {
        this.theaterTheaterID = theaterTheaterID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productProductID != null ? productProductID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieTicket)) {
            return false;
        }
        MovieTicket other = (MovieTicket) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.MovieTicket[ productProductID=" + productProductID + " ]";
    }
    
}
