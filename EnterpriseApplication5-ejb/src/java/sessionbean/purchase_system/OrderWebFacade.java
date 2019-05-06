/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.purchase_system;

import entities.purchase_system.OrderWeb;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Manh
 */
@Stateless
public class OrderWebFacade extends AbstractFacade<OrderWeb> implements OrderWebFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderWebFacade() {
        super(OrderWeb.class);
    }
    
}
