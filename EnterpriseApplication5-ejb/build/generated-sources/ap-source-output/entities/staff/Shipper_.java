package entities.staff;

import entities.shipping.Shipping;
import entities.staff.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Shipper.class)
public class Shipper_ { 

    public static volatile ListAttribute<Shipper, Shipping> shippingList;
    public static volatile SingularAttribute<Shipper, Integer> employeeEmployeeID;
    public static volatile SingularAttribute<Shipper, Employee> employee;

}