/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.purchase_system;

import entities.purchase_system.OrderWeb;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface OrderWebFacadeLocal {

    void create(OrderWeb orderWeb);

    void edit(OrderWeb orderWeb);

    void remove(OrderWeb orderWeb);

    OrderWeb find(Object id);

    List<OrderWeb> findAll();

    List<OrderWeb> findRange(int[] range);

    int count();
    
}
