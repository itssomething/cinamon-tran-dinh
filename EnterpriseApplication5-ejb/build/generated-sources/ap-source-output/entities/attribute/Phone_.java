package entities.attribute;

import entities.customer.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Phone.class)
public class Phone_ { 

    public static volatile SingularAttribute<Phone, Integer> phoneID;
    public static volatile SingularAttribute<Phone, String> phonenumber;
    public static volatile SingularAttribute<Phone, String> sectionCode;
    public static volatile ListAttribute<Phone, Customer> customerList;

}