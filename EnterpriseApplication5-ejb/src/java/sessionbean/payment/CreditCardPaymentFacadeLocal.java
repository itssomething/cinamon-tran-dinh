/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.payment;

import entities.payment.CreditCardPayment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface CreditCardPaymentFacadeLocal {

    void create(CreditCardPayment creditCardPayment);

    void edit(CreditCardPayment creditCardPayment);

    void remove(CreditCardPayment creditCardPayment);

    CreditCardPayment find(Object id);

    List<CreditCardPayment> findAll();

    List<CreditCardPayment> findRange(int[] range);

    int count();
    
}
