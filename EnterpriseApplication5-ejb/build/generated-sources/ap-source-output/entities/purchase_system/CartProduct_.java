package entities.purchase_system;

import entities.customer.Customer;
import entities.item.Product;
import entities.purchase_system.Cart;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(CartProduct.class)
public class CartProduct_ { 

    public static volatile SingularAttribute<CartProduct, Integer> orderOrderID;
    public static volatile SingularAttribute<CartProduct, Customer> customerCustomerID;
    public static volatile SingularAttribute<CartProduct, Product> productProductID;
    public static volatile SingularAttribute<CartProduct, Integer> quantity;
    public static volatile SingularAttribute<CartProduct, Cart> cartCartID;
    public static volatile SingularAttribute<CartProduct, Integer> id;
    public static volatile SingularAttribute<CartProduct, Integer> status;

}