/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.attribute;

import entities.attribute.Account;
import java.util.Collection;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface AccountFacadeLocal {

    void create(Account account);

    void edit(Account account);

    void remove(Account account);

    Account find(Object id);

    List<Account> findAll();

    List<Account> findRange(int[] range);

    int count();
    
    String randomString();

    public void createAccount(String username, String password);

    public Account findByUserName(String username);
    
    public boolean login(String username, String password);
    
    Account findByID(int id);
    
}
