package entities.payment;

import entities.payment.BankPayment;
import entities.payment.CoDPayment;
import entities.payment.CreditCardPayment;
import entities.purchase_system.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(PaymentMethod.class)
public class PaymentMethod_ { 

    public static volatile SingularAttribute<PaymentMethod, BankPayment> bankPayment;
    public static volatile SingularAttribute<PaymentMethod, CreditCardPayment> creditCardPayment;
    public static volatile SingularAttribute<PaymentMethod, CoDPayment> coDPayment;
    public static volatile ListAttribute<PaymentMethod, Order> order1List;
    public static volatile SingularAttribute<PaymentMethod, Integer> pMethodID;

}