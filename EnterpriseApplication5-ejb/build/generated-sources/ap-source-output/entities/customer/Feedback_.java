package entities.customer;

import entities.customer.Customer;
import entities.item.ProductStat;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Feedback.class)
public class Feedback_ { 

    public static volatile SingularAttribute<Feedback, Customer> customerCustomerID;
    public static volatile SingularAttribute<Feedback, Integer> star;
    public static volatile SingularAttribute<Feedback, ProductStat> productStatProductProductID;
    public static volatile SingularAttribute<Feedback, Integer> feedbackID;
    public static volatile SingularAttribute<Feedback, String> description;

}