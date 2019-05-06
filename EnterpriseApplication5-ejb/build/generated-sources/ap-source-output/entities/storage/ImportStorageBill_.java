package entities.storage;

import entities.item.Product;
import entities.storage.Provider;
import entities.storage.Storage;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(ImportStorageBill.class)
public class ImportStorageBill_ { 

    public static volatile SingularAttribute<ImportStorageBill, Storage> storageStorageID;
    public static volatile SingularAttribute<ImportStorageBill, Provider> providerProviderID;
    public static volatile SingularAttribute<ImportStorageBill, Float> totalMoney;
    public static volatile SingularAttribute<ImportStorageBill, Integer> importBillID;
    public static volatile SingularAttribute<ImportStorageBill, Integer> time;
    public static volatile ListAttribute<ImportStorageBill, Product> productList;

}