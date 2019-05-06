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
@Table(name = "Computer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Computer.findAll", query = "SELECT c FROM Computer c")
    , @NamedQuery(name = "Computer.findByRam", query = "SELECT c FROM Computer c WHERE c.ram = :ram")
    , @NamedQuery(name = "Computer.findByProcessor", query = "SELECT c FROM Computer c WHERE c.processor = :processor")
    , @NamedQuery(name = "Computer.findByHardDrive", query = "SELECT c FROM Computer c WHERE c.hardDrive = :hardDrive")
    , @NamedQuery(name = "Computer.findByOs", query = "SELECT c FROM Computer c WHERE c.os = :os")
    , @NamedQuery(name = "Computer.findByColor", query = "SELECT c FROM Computer c WHERE c.color = :color")
    , @NamedQuery(name = "Computer.findByScreenSize", query = "SELECT c FROM Computer c WHERE c.screenSize = :screenSize")
    , @NamedQuery(name = "Computer.findByProductProductID", query = "SELECT c FROM Computer c WHERE c.productProductID = :productProductID")})
public class Computer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "Ram")
    private String ram;
//    @Size(max = 255)
    @Column(name = "Processor")
    private String processor;
//    @Size(max = 255)
    @Column(name = "HardDrive")
    private String hardDrive;
//    @Size(max = 255)
    @Column(name = "Os")
    private String os;
//    @Size(max = 255)
    @Column(name = "Color")
    private String color;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "ScreenSize")
    private String screenSize;
    @Id
    @Basic(optional = false)
//    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Computer() {
    }

    public Computer(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public Computer(Integer productProductID, String ram, String screenSize) {
        this.productProductID = productProductID;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
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
        if (!(object instanceof Computer)) {
            return false;
        }
        Computer other = (Computer) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Computer[ productProductID=" + productProductID + " ]";
    }
    
}
