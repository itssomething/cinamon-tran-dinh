/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Toys;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ToysFacadeLocal {

    void create(Toys toys);

    void edit(Toys toys);

    void remove(Toys toys);

    Toys find(Object id);

    List<Toys> findAll();

    List<Toys> findRange(int[] range);

    int count();
    
}
