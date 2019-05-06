/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.EducationCenter;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface EducationCenterFacadeLocal {

    void create(EducationCenter educationCenter);

    void edit(EducationCenter educationCenter);

    void remove(EducationCenter educationCenter);

    EducationCenter find(Object id);

    List<EducationCenter> findAll();

    List<EducationCenter> findRange(int[] range);

    int count();
    
}