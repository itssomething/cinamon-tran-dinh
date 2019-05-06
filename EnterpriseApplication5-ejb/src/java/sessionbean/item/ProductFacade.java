/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Computer;
import entities.item.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manh
 */
@Stateless
public class ProductFacade extends AbstractFacade<Product> implements ProductFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }

    @Override
    public List<Product> getAllComputer() {
        Query q = em.createNativeQuery("SELECT * FROM product as p , computer as c where p.ProductID = c.ProductProductID", Product.class);
        List<Product> computers = (List) q.getResultList();
        return computers;
    }

    @Override
    public Product findByProductID(int id) {
        Query q = em.createNamedQuery("Product.findByProductID")
                .setParameter("productID", id);
        Product product = (Product) q.getSingleResult();
        return product;
    }

}
