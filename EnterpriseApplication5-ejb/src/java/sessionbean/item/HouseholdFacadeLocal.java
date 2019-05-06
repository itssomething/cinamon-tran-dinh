/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Household;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface HouseholdFacadeLocal {

    void create(Household household);

    void edit(Household household);

    void remove(Household household);

    Household find(Object id);

    List<Household> findAll();

    List<Household> findRange(int[] range);

    int count();
    
}
