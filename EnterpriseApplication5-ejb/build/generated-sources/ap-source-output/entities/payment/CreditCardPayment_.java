package entities.payment;

import entities.payment.PaymentMethod;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(CreditCardPayment.class)
public class CreditCardPayment_ { 

    public static volatile SingularAttribute<CreditCardPayment, String> ownerName;
    public static volatile SingularAttribute<CreditCardPayment, PaymentMethod> paymentMethod;
    public static volatile SingularAttribute<CreditCardPayment, String> cardNo;
    public static volatile SingularAttribute<CreditCardPayment, Integer> paymentMethodPMethodID;

}