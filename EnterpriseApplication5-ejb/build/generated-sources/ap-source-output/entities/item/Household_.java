package entities.item;

import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Household.class)
public class Household_ { 

    public static volatile SingularAttribute<Household, Product> product;
    public static volatile SingularAttribute<Household, Integer> productProductID;
    public static volatile SingularAttribute<Household, String> material;
    public static volatile SingularAttribute<Household, Integer> dueDate;

}