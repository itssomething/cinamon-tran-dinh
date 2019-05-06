/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.customer;

import entities.attribute.Account;
import entities.customer.Customer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manh
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> implements CustomerFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerFacade() {
        super(Customer.class);
    }
    
    @Override
    public Customer findByID(int id){
        Customer customer;
        customer = (Customer) em.createNamedQuery("Customer.findByCustomerID")
                .setParameter("customerID", id)
                .getSingleResult();
        return customer;
    }

    @Override
    public Customer findByUsername(String username) {
        Customer customer = new Customer();
        Query q = em.createNativeQuery("SELECT * FROM customer c INNER JOIN account a on a.AccountID = c.AccountAccountID WHERE a.username = ?", Customer.class)
                .setParameter(1, username);
        
        customer = (Customer) q.getSingleResult();
        return customer;
    }
}
