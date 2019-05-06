/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.storage;

import entities.storage.ExportStorageBill;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ExportStorageBillFacadeLocal {

    void create(ExportStorageBill exportStorageBill);

    void edit(ExportStorageBill exportStorageBill);

    void remove(ExportStorageBill exportStorageBill);

    ExportStorageBill find(Object id);

    List<ExportStorageBill> findAll();

    List<ExportStorageBill> findRange(int[] range);

    int count();
    
}
