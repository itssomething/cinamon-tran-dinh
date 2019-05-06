package entities.shipping;

import entities.shipping.Shipping;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(ShippingStatus.class)
public class ShippingStatus_ { 

    public static volatile ListAttribute<ShippingStatus, Shipping> shippingList;
    public static volatile SingularAttribute<ShippingStatus, Integer> statusID;
    public static volatile SingularAttribute<ShippingStatus, String> status;

}