package entities.purchase_system;

import entities.purchase_system.Order;
import entities.staff.OnlineSale;
import entities.staff.Shopkeeper;
import entities.storage.ExportStorageBill;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Bill.class)
public class Bill_ { 

    public static volatile ListAttribute<Bill, ExportStorageBill> exportStorageBillList;
    public static volatile SingularAttribute<Bill, Order> orderOrderID;
    public static volatile SingularAttribute<Bill, Integer> billID;
    public static volatile SingularAttribute<Bill, Shopkeeper> shopkeeperEmployeeEmployeeID;
    public static volatile SingularAttribute<Bill, String> paymentMethod;
    public static volatile SingularAttribute<Bill, OnlineSale> onlineSaleEmployeeEmployeeID;
    public static volatile SingularAttribute<Bill, Integer> time;
    public static volatile SingularAttribute<Bill, Float> changing;
    public static volatile SingularAttribute<Bill, Float> cash;
    public static volatile SingularAttribute<Bill, Float> applyAmount;

}