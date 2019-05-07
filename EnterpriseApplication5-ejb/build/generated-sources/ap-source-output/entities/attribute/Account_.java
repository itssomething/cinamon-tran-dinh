package entities.attribute;

import entities.customer.Customer;
import entities.staff.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Integer> accountID;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile ListAttribute<Account, Employee> employeeList;
    public static volatile ListAttribute<Account, Customer> customerList;
    public static volatile SingularAttribute<Account, String> username;

}