package entities.item;

import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Cars.class)
public class Cars_ { 

    public static volatile SingularAttribute<Cars, String> motor;
    public static volatile SingularAttribute<Cars, Product> product;
    public static volatile SingularAttribute<Cars, Integer> productProductID;
    public static volatile SingularAttribute<Cars, String> size;
    public static volatile SingularAttribute<Cars, String> color;
    public static volatile SingularAttribute<Cars, Integer> fuel;

}