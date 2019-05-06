/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.purchase_system;

import entities.item.Product;
import entities.purchase_system.CartProduct;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author duong
 */
@Stateless
public class CartProductFacade extends AbstractFacade<CartProduct> implements CartProductFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CartProductFacade() {
        super(CartProduct.class);
    }

    @Override
    public List<Product> getAllProductOfCustomer(int id) {
        Query q = em.createNativeQuery("SELECT p.ProductID, CustomerCustomerID, cp.CartCartID, ProductProductID, AccountAccountID, Name\n"
                + " FROM cartproduct cp \n"
                + " inner join customer c on c.CustomerID = cp.CustomerCustomerID\n"
                + " inner join product p on p.ProductID = cp.ProductProductID\n"
                + " where CustomerCustomerID=? ", Product.class)
                .setParameter(1, id);
        List<Product> products = q.getResultList();
        return products;
    }

    @Override
    public CartProduct findByProductAndCustomer(int productID, int customerID) {
        Query q = em.createNativeQuery("select * from cartproduct where CustomerCustomerID = ? and ProductProductID = ?",
                CartProduct.class)
                .setParameter(1, customerID)
                .setParameter(2, productID);
        CartProduct cartProduct = new CartProduct();
        cartProduct = (CartProduct) q.getSingleResult();
        return cartProduct;
    }

//    @Override
//    public void save(CartProduct cartProduct) {
//        Query q = em.create
//    }
    

}
