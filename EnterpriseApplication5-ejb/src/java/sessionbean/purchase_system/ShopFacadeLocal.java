/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.purchase_system;

import entities.purchase_system.Shop;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ShopFacadeLocal {

    void create(Shop shop);

    void edit(Shop shop);

    void remove(Shop shop);

    Shop find(Object id);

    List<Shop> findAll();

    List<Shop> findRange(int[] range);

    int count();
    
}
