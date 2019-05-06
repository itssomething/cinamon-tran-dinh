/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.staff;

import entities.staff.StorageEmployee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface StorageEmployeeFacadeLocal {

    void create(StorageEmployee storageEmployee);

    void edit(StorageEmployee storageEmployee);

    void remove(StorageEmployee storageEmployee);

    StorageEmployee find(Object id);

    List<StorageEmployee> findAll();

    List<StorageEmployee> findRange(int[] range);

    int count();
    
}
