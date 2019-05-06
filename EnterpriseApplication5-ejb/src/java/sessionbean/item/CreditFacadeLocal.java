/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Credit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface CreditFacadeLocal {

    void create(Credit credit);

    void edit(Credit credit);

    void remove(Credit credit);

    Credit find(Object id);

    List<Credit> findAll();

    List<Credit> findRange(int[] range);

    int count();
    
}
