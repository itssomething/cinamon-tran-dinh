/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.attribute;

import entities.attribute.FullName;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface FullNameFacadeLocal {

    void create(FullName fullName);

    void edit(FullName fullName);

    void remove(FullName fullName);

    FullName find(Object id);

    List<FullName> findAll();

    List<FullName> findRange(int[] range);

    int count();
    
    FullName findByCustomerID(int customerID);
    
}
