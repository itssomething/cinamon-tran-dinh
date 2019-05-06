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
@Table(name = "EducationCenter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EducationCenter.findAll", query = "SELECT e FROM EducationCenter e")
    , @NamedQuery(name = "EducationCenter.findByEduCenterID", query = "SELECT e FROM EducationCenter e WHERE e.eduCenterID = :eduCenterID")
    , @NamedQuery(name = "EducationCenter.findByName", query = "SELECT e FROM EducationCenter e WHERE e.name = :name")
    , @NamedQuery(name = "EducationCenter.findByAddress", query = "SELECT e FROM EducationCenter e WHERE e.address = :address")})
public class EducationCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EduCenterID")
    private Integer eduCenterID;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "educationCenterEduCenterID")
    private List<LearningCourse> learningCourseList;

    public EducationCenter() {
    }

    public EducationCenter(Integer eduCenterID) {
        this.eduCenterID = eduCenterID;
    }

    public Integer getEduCenterID() {
        return eduCenterID;
    }

    public void setEduCenterID(Integer eduCenterID) {
        this.eduCenterID = eduCenterID;
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
    public List<LearningCourse> getLearningCourseList() {
        return learningCourseList;
    }

    public void setLearningCourseList(List<LearningCourse> learningCourseList) {
        this.learningCourseList = learningCourseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eduCenterID != null ? eduCenterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EducationCenter)) {
            return false;
        }
        EducationCenter other = (EducationCenter) object;
        if ((this.eduCenterID == null && other.eduCenterID != null) || (this.eduCenterID != null && !this.eduCenterID.equals(other.eduCenterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EducationCenter[ eduCenterID=" + eduCenterID + " ]";
    }
    
}
