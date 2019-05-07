package entities.payment;

import entities.payment.PaymentMethod;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(CoDPayment.class)
public class CoDPayment_ { 

    public static volatile SingularAttribute<CoDPayment, Float> fee;
    public static volatile SingularAttribute<CoDPayment, PaymentMethod> paymentMethod;
    public static volatile SingularAttribute<CoDPayment, Integer> paymentMethodPMethodID;

}