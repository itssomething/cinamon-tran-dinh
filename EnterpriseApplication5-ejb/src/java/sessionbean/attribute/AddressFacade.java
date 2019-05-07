/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.attribute;

import entities.attribute.Address;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manh
 */
@Stateless
public class AddressFacade extends AbstractFacade<Address> implements AddressFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressFacade() {
        super(Address.class);
    }

    @Override
    public Address findByCustomerID(int customerID) {
        Query q = em.createNativeQuery("SELECT * FROM customer c inner join address a on c.AddressAddressID = a.AddressID where c.CustomerID = ?",
                Address.class)
                .setParameter(1, customerID);
        Address a = (Address) q.getSingleResult();
        return a;
    }
    
}
