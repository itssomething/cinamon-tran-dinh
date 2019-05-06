/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.LearningCourse;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface LearningCourseFacadeLocal {

    void create(LearningCourse learningCourse);

    void edit(LearningCourse learningCourse);

    void remove(LearningCourse learningCourse);

    LearningCourse find(Object id);

    List<LearningCourse> findAll();

    List<LearningCourse> findRange(int[] range);

    int count();
    
}
