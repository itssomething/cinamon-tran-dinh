/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.storage;

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
@Table(name = "Provider")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provider.findAll", query = "SELECT p FROM Provider p")
    , @NamedQuery(name = "Provider.findByProviderID", query = "SELECT p FROM Provider p WHERE p.providerID = :providerID")
    , @NamedQuery(name = "Provider.findByName", query = "SELECT p FROM Provider p WHERE p.name = :name")
    , @NamedQuery(name = "Provider.findByAddress", query = "SELECT p FROM Provider p WHERE p.address = :address")
    , @NamedQuery(name = "Provider.findByPhone", query = "SELECT p FROM Provider p WHERE p.phone = :phone")})
public class Provider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProviderID")
    private Integer providerID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "Phone")
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "providerProviderID")
    private List<ImportStorageBill> importStorageBillList;

    public Provider() {
    }

    public Provider(Integer providerID) {
        this.providerID = providerID;
    }

    public Integer getProviderID() {
        return providerID;
    }

    public void setProviderID(Integer providerID) {
        this.providerID = providerID;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlTransient
    public List<ImportStorageBill> getImportStorageBillList() {
        return importStorageBillList;
    }

    public void setImportStorageBillList(List<ImportStorageBill> importStorageBillList) {
        this.importStorageBillList = importStorageBillList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (providerID != null ? providerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provider)) {
            return false;
        }
        Provider other = (Provider) object;
        if ((this.providerID == null && other.providerID != null) || (this.providerID != null && !this.providerID.equals(other.providerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Provider[ providerID=" + providerID + " ]";
    }
    
}
