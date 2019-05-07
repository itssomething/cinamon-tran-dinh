package entities.payment;

import entities.payment.Bank;
import entities.payment.PaymentMethod;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(BankPayment.class)
public class BankPayment_ { 

    public static volatile SingularAttribute<BankPayment, Bank> bankBankID;
    public static volatile SingularAttribute<BankPayment, String> ownerName;
    public static volatile SingularAttribute<BankPayment, PaymentMethod> paymentMethod;
    public static volatile SingularAttribute<BankPayment, String> cardNo;
    public static volatile SingularAttribute<BankPayment, Integer> paymentMethodPMethodID;

}