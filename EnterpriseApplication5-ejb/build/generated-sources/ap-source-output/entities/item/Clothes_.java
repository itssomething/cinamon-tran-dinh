package entities.item;

import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Clothes.class)
public class Clothes_ { 

    public static volatile SingularAttribute<Clothes, Product> product;
    public static volatile SingularAttribute<Clothes, Integer> productProductID;
    public static volatile SingularAttribute<Clothes, String> color;
    public static volatile SingularAttribute<Clothes, String> size;

}