/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.attribute;

import entities.attribute.FullName;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manh
 */
@Stateless
public class FullNameFacade extends AbstractFacade<FullName> implements FullNameFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FullNameFacade() {
        super(FullName.class);
    }

    @Override
    public FullName findByCustomerID(int customerID) {
        Query q = em.createNativeQuery("SELECT * FROM customer c inner join fullname f on c.FullNameFNID = f.FNID where c.CustomerID = ?",
                FullName.class)
                .setParameter(1, customerID);
        FullName a = (FullName) q.getSingleResult();
        return a;
    }

}
