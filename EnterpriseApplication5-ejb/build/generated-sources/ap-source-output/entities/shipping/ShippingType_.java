package entities.shipping;

import entities.shipping.Shipping;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(ShippingType.class)
public class ShippingType_ { 

    public static volatile ListAttribute<ShippingType, Shipping> shippingList;
    public static volatile SingularAttribute<ShippingType, Integer> shipTypeID;
    public static volatile SingularAttribute<ShippingType, String> name;

}