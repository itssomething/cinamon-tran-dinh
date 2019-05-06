/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.storage;

import entities.storage.ExportStorageBill;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Manh
 */
@Stateless
public class ExportStorageBillFacade extends AbstractFacade<ExportStorageBill> implements ExportStorageBillFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExportStorageBillFacade() {
        super(ExportStorageBill.class);
    }
    
}
