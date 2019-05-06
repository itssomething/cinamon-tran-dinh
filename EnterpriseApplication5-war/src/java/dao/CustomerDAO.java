/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.customer.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 *
 * @author Manh
 */
public class CustomerDAO implements Dao<Customer> {
     
    private List<Customer> customers = new ArrayList<>();
     
    public CustomerDAO() {
    }
     
    @Override
    public Optional<Customer> get(int id) {
        return Optional.ofNullable(customers.get((int) id));
    }
     
    @Override
    public List<Customer> getAll() {
        return customers;
    }
     
    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }
     
//    @Override
//    public void update(Customer customer, String[] params) {
//        customer.setName(Objects.requireNonNull(
//          params[0], "Name cannot be null"));
//        customer.setEmail(Objects.requireNonNull(
//          params[1], "Email cannot be null"));
//         
//        customers.add(customer);
//    }
     
    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void update(Customer t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}