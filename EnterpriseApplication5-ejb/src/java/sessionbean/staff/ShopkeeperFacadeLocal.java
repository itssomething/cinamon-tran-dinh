/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.staff;

import entities.staff.Shopkeeper;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ShopkeeperFacadeLocal {

    void create(Shopkeeper shopkeeper);

    void edit(Shopkeeper shopkeeper);

    void remove(Shopkeeper shopkeeper);

    Shopkeeper find(Object id);

    List<Shopkeeper> findAll();

    List<Shopkeeper> findRange(int[] range);

    int count();
    
}
