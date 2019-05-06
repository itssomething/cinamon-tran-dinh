/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.payment;

import entities.payment.CreditCardPayment;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Manh
 */
@Stateless
public class CreditCardPaymentFacade extends AbstractFacade<CreditCardPayment> implements CreditCardPaymentFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CreditCardPaymentFacade() {
        super(CreditCardPayment.class);
    }
    
}
