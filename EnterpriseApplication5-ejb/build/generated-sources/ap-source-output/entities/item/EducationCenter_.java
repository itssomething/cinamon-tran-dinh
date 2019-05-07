package entities.item;

import entities.item.LearningCourse;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(EducationCenter.class)
public class EducationCenter_ { 

    public static volatile SingularAttribute<EducationCenter, String> address;
    public static volatile ListAttribute<EducationCenter, LearningCourse> learningCourseList;
    public static volatile SingularAttribute<EducationCenter, String> name;
    public static volatile SingularAttribute<EducationCenter, Integer> eduCenterID;

}