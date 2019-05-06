/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.purchase_system;

import entities.item.Product;
import entities.purchase_system.CartProduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author duong
 */
@Local
public interface CartProductFacadeLocal {

    void create(CartProduct cartproduct);

    void edit(CartProduct cartproduct);

    void remove(CartProduct cartproduct);

    CartProduct find(Object id);

    List<CartProduct> findAll();

    List<CartProduct> findRange(int[] range);

    int count();
    
    List<Product> getAllProductOfCustomer(int id);
    
    CartProduct findByProductAndCustomer(int productID, int customerID);
    
//    void save(CartProduct cartProduct);
    
}
