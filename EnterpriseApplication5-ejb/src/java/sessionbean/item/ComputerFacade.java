/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Computer;
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
public class ComputerFacade extends AbstractFacade<Computer> implements ComputerFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComputerFacade() {
        super(Computer.class);
    }

    @Override
    public List<Computer> getAllComputer() {
        Query q = em.createNativeQuery("SELECT * FROM product as p , computer as c where p.ProductID = c.ProductProductID");
        List<Computer> computers = (List) q.getResultList();
        return computers;
    }
    
}
