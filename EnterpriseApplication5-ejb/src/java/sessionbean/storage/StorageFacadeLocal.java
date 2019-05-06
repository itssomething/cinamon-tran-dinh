/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.storage;

import entities.storage.Storage;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface StorageFacadeLocal {

    void create(Storage storage);

    void edit(Storage storage);

    void remove(Storage storage);

    Storage find(Object id);

    List<Storage> findAll();

    List<Storage> findRange(int[] range);

    int count();
    
}
