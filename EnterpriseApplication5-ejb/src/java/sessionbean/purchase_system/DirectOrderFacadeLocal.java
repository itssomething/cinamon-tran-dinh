/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.purchase_system;

import entities.purchase_system.DirectOrder;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface DirectOrderFacadeLocal {

    void create(DirectOrder directOrder);

    void edit(DirectOrder directOrder);

    void remove(DirectOrder directOrder);

    DirectOrder find(Object id);

    List<DirectOrder> findAll();

    List<DirectOrder> findRange(int[] range);

    int count();
    
}
