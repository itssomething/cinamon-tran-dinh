/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.payment;

import entities.payment.CoDPayment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface CoDPaymentFacadeLocal {

    void create(CoDPayment coDPayment);

    void edit(CoDPayment coDPayment);

    void remove(CoDPayment coDPayment);

    CoDPayment find(Object id);

    List<CoDPayment> findAll();

    List<CoDPayment> findRange(int[] range);

    int count();
    
}
