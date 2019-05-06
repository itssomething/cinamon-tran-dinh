package entities.shipping;

import entities.purchase_system.Order;
import entities.shipping.ShippingStatus;
import entities.shipping.ShippingType;
import entities.shipping.Vehicle;
import entities.staff.Shipper;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Shipping.class)
public class Shipping_ { 

    public static volatile SingularAttribute<Shipping, Vehicle> vehicleVehicleID;
    public static volatile SingularAttribute<Shipping, Shipper> shipperEmployeeEmployeeID;
    public static volatile SingularAttribute<Shipping, Integer> regionCode;
    public static volatile SingularAttribute<Shipping, Integer> shippingID;
    public static volatile SingularAttribute<Shipping, Float> cost;
    public static volatile SingularAttribute<Shipping, Integer> shippingDate;
    public static volatile ListAttribute<Shipping, Order> order1List;
    public static volatile SingularAttribute<Shipping, ShippingStatus> shippingStatusStatusID;
    public static volatile SingularAttribute<Shipping, ShippingType> shippingTypeShipTypeID;

}