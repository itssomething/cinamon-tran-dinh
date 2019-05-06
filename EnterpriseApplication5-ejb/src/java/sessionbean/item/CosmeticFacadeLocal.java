/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Cosmetic;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface CosmeticFacadeLocal {

    void create(Cosmetic cosmetic);

    void edit(Cosmetic cosmetic);

    void remove(Cosmetic cosmetic);

    Cosmetic find(Object id);

    List<Cosmetic> findAll();

    List<Cosmetic> findRange(int[] range);

    int count();
    
}
