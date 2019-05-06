/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Theater;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface TheaterFacadeLocal {

    void create(Theater theater);

    void edit(Theater theater);

    void remove(Theater theater);

    Theater find(Object id);

    List<Theater> findAll();

    List<Theater> findRange(int[] range);

    int count();
    
}
