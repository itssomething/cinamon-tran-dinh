package entities.customer;

import entities.attribute.Account;
import entities.attribute.Address;
import entities.attribute.FullName;
import entities.attribute.Phone;
import entities.customer.Feedback;
import entities.purchase_system.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Address> addressAddressID;
    public static volatile SingularAttribute<Customer, Integer> level;
    public static volatile SingularAttribute<Customer, Account> accountAccountID;
    public static volatile SingularAttribute<Customer, Integer> customerID;
    public static volatile SingularAttribute<Customer, Phone> phonePhoneID;
    public static volatile ListAttribute<Customer, Order> order1List;
    public static volatile SingularAttribute<Customer, FullName> fullNameFNID;
    public static volatile ListAttribute<Customer, Feedback> feedbackList;
    public static volatile SingularAttribute<Customer, Integer> point;

}