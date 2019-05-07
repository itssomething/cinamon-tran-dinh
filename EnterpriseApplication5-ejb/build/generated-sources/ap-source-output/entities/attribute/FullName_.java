package entities.attribute;

import entities.customer.Customer;
import entities.staff.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(FullName.class)
public class FullName_ { 

    public static volatile SingularAttribute<FullName, String> firstName;
    public static volatile SingularAttribute<FullName, Integer> fnid;
    public static volatile ListAttribute<FullName, Employee> employeeList;
    public static volatile SingularAttribute<FullName, String> middleName;
    public static volatile ListAttribute<FullName, Customer> customerList;
    public static volatile SingularAttribute<FullName, String> lastname;

}