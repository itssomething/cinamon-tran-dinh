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
@Table(name = "LearningCourse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LearningCourse.findAll", query = "SELECT l FROM LearningCourse l")
    , @NamedQuery(name = "LearningCourse.findByNumberOfLesson", query = "SELECT l FROM LearningCourse l WHERE l.numberOfLesson = :numberOfLesson")
    , @NamedQuery(name = "LearningCourse.findBySubject", query = "SELECT l FROM LearningCourse l WHERE l.subject = :subject")
    , @NamedQuery(name = "LearningCourse.findByTimeTable", query = "SELECT l FROM LearningCourse l WHERE l.timeTable = :timeTable")
    , @NamedQuery(name = "LearningCourse.findByBegin", query = "SELECT l FROM LearningCourse l WHERE l.begin = :begin")
    , @NamedQuery(name = "LearningCourse.findByProductProductID", query = "SELECT l FROM LearningCourse l WHERE l.productProductID = :productProductID")})
public class LearningCourse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumberOfLesson")
    private int numberOfLesson;
    @Size(max = 255)
    @Column(name = "Subject")
    private String subject;
    @Size(max = 255)
    @Column(name = "TimeTable")
    private String timeTable;
    @Column(name = "Begin")
    private Integer begin;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductProductID")
    private Integer productProductID;
    @JoinColumn(name = "EducationCenterEduCenterID", referencedColumnName = "EduCenterID")
    @ManyToOne(optional = false)
    private EducationCenter educationCenterEduCenterID;
    @JoinColumn(name = "ProductProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public LearningCourse() {
    }

    public LearningCourse(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public LearningCourse(Integer productProductID, int numberOfLesson) {
        this.productProductID = productProductID;
        this.numberOfLesson = numberOfLesson;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getProductProductID() {
        return productProductID;
    }

    public void setProductProductID(Integer productProductID) {
        this.productProductID = productProductID;
    }

    public EducationCenter getEducationCenterEduCenterID() {
        return educationCenterEduCenterID;
    }

    public void setEducationCenterEduCenterID(EducationCenter educationCenterEduCenterID) {
        this.educationCenterEduCenterID = educationCenterEduCenterID;
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
        if (!(object instanceof LearningCourse)) {
            return false;
        }
        LearningCourse other = (LearningCourse) object;
        if ((this.productProductID == null && other.productProductID != null) || (this.productProductID != null && !this.productProductID.equals(other.productProductID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.LearningCourse[ productProductID=" + productProductID + " ]";
    }
    
}
