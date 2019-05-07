package entities.purchase_system;

import entities.item.Product;
import entities.purchase_system.CartProduct;
import entities.purchase_system.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, Integer> amount;
    public static volatile SingularAttribute<Cart, Integer> quantity;
    public static volatile SingularAttribute<Cart, Float> money;
    public static volatile ListAttribute<Cart, CartProduct> cartProductList;
    public static volatile SingularAttribute<Cart, Integer> cartID;
    public static volatile ListAttribute<Cart, Order> orderList;
    public static volatile ListAttribute<Cart, Product> productList;

}