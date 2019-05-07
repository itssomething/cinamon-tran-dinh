package entities.staff;

import entities.attribute.Account;
import entities.attribute.FullName;
import entities.staff.OnlineSale;
import entities.staff.Shipper;
import entities.staff.Shopkeeper;
import entities.staff.StorageEmployee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Shipper> shipper;
    public static volatile SingularAttribute<Employee, OnlineSale> onlineSale;
    public static volatile SingularAttribute<Employee, String> role;
    public static volatile SingularAttribute<Employee, Shopkeeper> shopkeeper;
    public static volatile SingularAttribute<Employee, StorageEmployee> storageEmployee;
    public static volatile SingularAttribute<Employee, Account> accountAccountID;
    public static volatile SingularAttribute<Employee, Integer> employeeID;
    public static volatile SingularAttribute<Employee, String> department;
    public static volatile SingularAttribute<Employee, FullName> fullNameFNID;

}