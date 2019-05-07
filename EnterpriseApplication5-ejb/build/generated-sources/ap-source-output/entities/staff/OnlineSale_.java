package entities.staff;

import entities.purchase_system.Bill;
import entities.staff.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(OnlineSale.class)
public class OnlineSale_ { 

    public static volatile SingularAttribute<OnlineSale, Integer> employeeEmployeeID;
    public static volatile ListAttribute<OnlineSale, Bill> billList;
    public static volatile SingularAttribute<OnlineSale, Employee> employee;

}