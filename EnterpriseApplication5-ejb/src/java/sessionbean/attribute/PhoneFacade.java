/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.attribute;

import entities.attribute.Phone;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manh
 */
@Stateless
public class PhoneFacade extends AbstractFacade<Phone> implements PhoneFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PhoneFacade() {
        super(Phone.class);
    }

    @Override
    public Phone findByCustomerID(int customerID) {
        Query q = em.createNativeQuery("SELECT * FROM customer c inner join phone p on c.PhonePhoneID = p.PhoneID where c.CustomerID = ?",
                Phone.class)
                .setParameter(1, customerID);
        Phone a = (Phone) q.getSingleResult();
        return a;        
    }
    
}
