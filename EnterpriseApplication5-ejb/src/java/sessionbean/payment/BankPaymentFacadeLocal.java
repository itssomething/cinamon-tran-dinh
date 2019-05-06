/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.payment;

import entities.payment.BankPayment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface BankPaymentFacadeLocal {

    void create(BankPayment bankPayment);

    void edit(BankPayment bankPayment);

    void remove(BankPayment bankPayment);

    BankPayment find(Object id);

    List<BankPayment> findAll();

    List<BankPayment> findRange(int[] range);

    int count();
    
}
