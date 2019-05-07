package entities.item;

import entities.customer.Feedback;
import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(ProductStat.class)
public class ProductStat_ { 

    public static volatile SingularAttribute<ProductStat, Product> product;
    public static volatile SingularAttribute<ProductStat, Integer> productProductID;
    public static volatile ListAttribute<ProductStat, Feedback> feedbackList;
    public static volatile SingularAttribute<ProductStat, Integer> boughtTime;

}