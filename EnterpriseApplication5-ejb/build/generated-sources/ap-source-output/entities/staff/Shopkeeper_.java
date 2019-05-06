package entities.staff;

import entities.purchase_system.Bill;
import entities.purchase_system.Shop;
import entities.staff.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Shopkeeper.class)
public class Shopkeeper_ { 

    public static volatile SingularAttribute<Shopkeeper, Shop> shopShopID;
    public static volatile SingularAttribute<Shopkeeper, Integer> employeeEmployeeID;
    public static volatile ListAttribute<Shopkeeper, Bill> billList;
    public static volatile SingularAttribute<Shopkeeper, Employee> employee;

}