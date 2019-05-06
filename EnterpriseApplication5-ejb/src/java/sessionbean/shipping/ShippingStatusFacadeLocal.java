/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.shipping;

import entities.shipping.ShippingStatus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ShippingStatusFacadeLocal {

    void create(ShippingStatus shippingStatus);

    void edit(ShippingStatus shippingStatus);

    void remove(ShippingStatus shippingStatus);

    ShippingStatus find(Object id);

    List<ShippingStatus> findAll();

    List<ShippingStatus> findRange(int[] range);

    int count();
    
}
