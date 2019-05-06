/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Mobile;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface MobileFacadeLocal {

    void create(Mobile mobile);

    void edit(Mobile mobile);

    void remove(Mobile mobile);

    Mobile find(Object id);

    List<Mobile> findAll();

    List<Mobile> findRange(int[] range);

    int count();
    
}
