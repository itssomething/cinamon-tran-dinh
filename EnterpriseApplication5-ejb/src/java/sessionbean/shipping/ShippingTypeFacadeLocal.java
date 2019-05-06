/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.shipping;

import entities.shipping.ShippingType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ShippingTypeFacadeLocal {

    void create(ShippingType shippingType);

    void edit(ShippingType shippingType);

    void remove(ShippingType shippingType);

    ShippingType find(Object id);

    List<ShippingType> findAll();

    List<ShippingType> findRange(int[] range);

    int count();
    
}
