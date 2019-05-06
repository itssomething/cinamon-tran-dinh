package entities.purchase_system;

import entities.customer.Customer;
import entities.payment.PaymentMethod;
import entities.purchase_system.Bill;
import entities.purchase_system.Cart;
import entities.purchase_system.DirectOrder;
import entities.purchase_system.OrderWeb;
import entities.shipping.Shipping;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Integer> orderTime;
    public static volatile SingularAttribute<Order, Customer> customerCustomerID;
    public static volatile SingularAttribute<Order, Integer> orderID;
    public static volatile SingularAttribute<Order, Cart> cartCartID;
    public static volatile SingularAttribute<Order, OrderWeb> orderWeb;
    public static volatile ListAttribute<Order, Bill> billList;
    public static volatile SingularAttribute<Order, DirectOrder> directOrder;
    public static volatile SingularAttribute<Order, String> status;
    public static volatile SingularAttribute<Order, PaymentMethod> paymentMethodPMethodID;
    public static volatile SingularAttribute<Order, Shipping> shippingShippingID;

}