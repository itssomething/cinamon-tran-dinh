package entities.payment;

import entities.payment.BankPayment;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Bank.class)
public class Bank_ { 

    public static volatile SingularAttribute<Bank, Integer> bankID;
    public static volatile ListAttribute<Bank, BankPayment> bankPaymentList;
    public static volatile SingularAttribute<Bank, String> address;
    public static volatile SingularAttribute<Bank, String> name;

}