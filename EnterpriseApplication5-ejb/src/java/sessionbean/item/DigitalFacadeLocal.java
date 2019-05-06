/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Digital;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface DigitalFacadeLocal {

    void create(Digital digital);

    void edit(Digital digital);

    void remove(Digital digital);

    Digital find(Object id);

    List<Digital> findAll();

    List<Digital> findRange(int[] range);

    int count();
    
}
