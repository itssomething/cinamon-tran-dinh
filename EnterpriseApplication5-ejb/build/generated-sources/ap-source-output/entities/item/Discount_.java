package entities.item;

import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Discount.class)
public class Discount_ { 

    public static volatile SingularAttribute<Discount, Integer> discountID;
    public static volatile ListAttribute<Discount, Product> productList;
    public static volatile SingularAttribute<Discount, Float> ratio;

}