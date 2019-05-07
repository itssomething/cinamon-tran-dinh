package entities.item;

import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Accessory.class)
public class Accessory_ { 

    public static volatile SingularAttribute<Accessory, Product> product;
    public static volatile SingularAttribute<Accessory, Integer> productProductID;
    public static volatile SingularAttribute<Accessory, String> material;
    public static volatile SingularAttribute<Accessory, Float> weight;

}