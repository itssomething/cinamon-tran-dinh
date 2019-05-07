package entities.item;

import entities.item.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Computer.class)
public class Computer_ { 

    public static volatile SingularAttribute<Computer, String> hardDrive;
    public static volatile SingularAttribute<Computer, Product> product;
    public static volatile SingularAttribute<Computer, String> screenSize;
    public static volatile SingularAttribute<Computer, Integer> productProductID;
    public static volatile SingularAttribute<Computer, String> os;
    public static volatile SingularAttribute<Computer, String> color;
    public static volatile SingularAttribute<Computer, String> processor;
    public static volatile SingularAttribute<Computer, String> ram;

}