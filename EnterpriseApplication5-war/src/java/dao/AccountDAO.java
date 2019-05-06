/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.attribute.Account;
import entities.customer.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Manh
 */
public class AccountDAO implements Dao<Account>{
    
    private List<Account> accounts = new ArrayList<>();

    @Override
    public Optional<Account> get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Account t) {
        accounts.add(t);
    }

    @Override
    public void update(Account t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Account t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
