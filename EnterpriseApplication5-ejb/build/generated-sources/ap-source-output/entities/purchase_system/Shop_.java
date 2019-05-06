package entities.purchase_system;

import entities.staff.Shopkeeper;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Shop.class)
public class Shop_ { 

    public static volatile ListAttribute<Shop, Shopkeeper> shopkeeperList;
    public static volatile SingularAttribute<Shop, String> address;
    public static volatile SingularAttribute<Shop, String> name;
    public static volatile SingularAttribute<Shop, Integer> shopID;

}