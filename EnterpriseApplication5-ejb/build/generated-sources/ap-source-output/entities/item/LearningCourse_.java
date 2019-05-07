package entities.item;

import entities.item.EducationCenter;
import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(LearningCourse.class)
public class LearningCourse_ { 

    public static volatile SingularAttribute<LearningCourse, EducationCenter> educationCenterEduCenterID;
    public static volatile SingularAttribute<LearningCourse, Product> product;
    public static volatile SingularAttribute<LearningCourse, Integer> productProductID;
    public static volatile SingularAttribute<LearningCourse, String> subject;
    public static volatile SingularAttribute<LearningCourse, Integer> numberOfLesson;
    public static volatile SingularAttribute<LearningCourse, String> timeTable;
    public static volatile SingularAttribute<LearningCourse, Integer> begin;

}