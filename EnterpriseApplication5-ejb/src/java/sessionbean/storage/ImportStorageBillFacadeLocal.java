/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.storage;

import entities.storage.ImportStorageBill;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ImportStorageBillFacadeLocal {

    void create(ImportStorageBill importStorageBill);

    void edit(ImportStorageBill importStorageBill);

    void remove(ImportStorageBill importStorageBill);

    ImportStorageBill find(Object id);

    List<ImportStorageBill> findAll();

    List<ImportStorageBill> findRange(int[] range);

    int count();
    
}
