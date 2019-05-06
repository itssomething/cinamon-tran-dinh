/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.attribute;

import entities.attribute.Account;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manh
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }

    @Override
    public String randomString() {
        return "a";
    }

    @Override
    public void createAccount(String username, String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        this.create(account);
    }

    @Override
    public Account findByUserName(String username) {
        Account result;
        result = (Account) em.createNamedQuery("Account.findByUsername").setParameter("username", username).getSingleResult();
        return result;
    }
    
    @Override
    public Account findByID(int id) {
        Account result;
        result = (Account) em.createNamedQuery("Account.findByAccountID").setParameter("accountID", id).getSingleResult();
        return result;
    }

    @Override
    public boolean login(String username, String password) {
        try {
            Account result;
            result = (Account) em.createNamedQuery("Account.login")
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
