/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Discount;
import java.util.Iterator;
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
public class DiscountFacade extends AbstractFacade<Discount> implements DiscountFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiscountFacade() {
        super(Discount.class);
    }

    @Override
    public Discount findFirst() {
        Discount discount = new Discount();
        Query q = em.createNativeQuery("SELECT * FROM Discount LIMIT 1", Discount.class);
        System.out.println("CHưa in lỗi mẹ r");

        List<Discount> discounts = (List) q.getResultList();

//        System.out.println((Integer) discounts.get(0).getDiscountID() + ";;;;");
        discount.setDiscountID((Integer) discounts.get(0).getDiscountID());

        discount.setRatio((Float) discounts.get(0).getRatio());

        return discount;
    }
}
