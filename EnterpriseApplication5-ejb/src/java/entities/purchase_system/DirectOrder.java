/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.purchase_system;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "DirectOrder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DirectOrder.findAll", query = "SELECT d FROM DirectOrder d")
    , @NamedQuery(name = "DirectOrder.findByOrderOrderID", query = "SELECT d FROM DirectOrder d WHERE d.orderOrderID = :orderOrderID")})
public class DirectOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderOrderID")
    private Integer orderOrderID;
    @JoinColumn(name = "OrderOrderID", referencedColumnName = "OrderID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Order order;

    public DirectOrder() {
    }

    public DirectOrder(Integer orderOrderID) {
        this.orderOrderID = orderOrderID;
    }

    public Integer getOrderOrderID() {
        return orderOrderID;
    }

    public void setOrderOrderID(Integer orderOrderID) {
        this.orderOrderID = orderOrderID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderOrderID != null ? orderOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DirectOrder)) {
            return false;
        }
        DirectOrder other = (DirectOrder) object;
        if ((this.orderOrderID == null && other.orderOrderID != null) || (this.orderOrderID != null && !this.orderOrderID.equals(other.orderOrderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DirectOrder[ orderOrderID=" + orderOrderID + " ]";
    }
    
}
