/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "Mobile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mobile.findAll", query = "SELECT m FROM Mobile m")
    , @NamedQuery(name = "Mobile.findByPin", query = "SELECT m FROM Mobile m WHERE m.pin = :pin")
    , @NamedQuery(name = "Mobile.findByScreenSize", query = "SELECT m FROM Mobile m WHERE m.screenSize = :screenSize")
    , @NamedQuery(name = "Mobile.findByFrontCamera", query = "SELECT m FROM Mobile m WHERE m.frontCamera = :frontCamera")
    , @NamedQuery(name = "Mobile.findByBehindCamera", query = "SELECT m FROM Mobile m WHERE m.behindCamera = :behindCamera")
    , @NamedQuery(name = "Mobile.findByOs", query = "SELECT m FROM Mobile m WHERE m.os = :os")
    , @NamedQuery(name = "Mobile.findByRam", query = "SELECT m FROM Mobile m WHERE m.ram = :ram")
    , @NamedQuery(name = "Mobile.findByRom", query = "SELECT m FROM Mobile m WHERE m.rom = :rom")
    , @NamedQuery(name = "Mobile.findByProductProductID", query = "SELECT m FROM Mobile m WHERE m.productProductID = :productProductID")})
public class Mobile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pin")
    private int pin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ScreenSize")
    private int screenSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FrontCamera")
    private int frontCamera;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BehindCamera")
    private int behindCamera;
    @Size(max = 255)
    @Column(name = "Os")
    private String os;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ram")
    private int ram;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Rom")
    private int rom;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Mobile() {
    }

    public Mobile(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Mobile(Integer productProductID, int pin, int screenSize, int frontCamera, int behindCamera, int ram, int rom) {
        this.productProductID = productProductID;
        this.pin = pin;
        this.screenSize = screenSize;
        this.frontCamera = frontCamera;
        this.behindCamera = behindCamera;
        this.ram = ram;
        this.rom = rom;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(int frontCamera) {
        this.frontCamera = frontCamera;
    }

    public int getBehindCamera() {
        return behindCamera;
    }

    public void setBehindCamera(int behindCamera) {
        this.behindCamera = behindCamera;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public Integer getProductProductID() {
        return productProductID;
    }

    public void setProductProductID(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        if (!(object instanceof Mobile)) {
            return false;
        }
        Mobile other = (Mobile) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mobile[ productProductID=" + productProductID + " ]";
    }
    
}
