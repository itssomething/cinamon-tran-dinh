package entities.storage;

import entities.storage.ImportStorageBill;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Provider.class)
public class Provider_ { 

    public static volatile SingularAttribute<Provider, String> address;
    public static volatile SingularAttribute<Provider, String> phone;
    public static volatile SingularAttribute<Provider, Integer> providerID;
    public static volatile ListAttribute<Provider, ImportStorageBill> importStorageBillList;
    public static volatile SingularAttribute<Provider, String> name;

}