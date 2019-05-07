package entities.storage;

import entities.purchase_system.Bill;
import entities.storage.Storage;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(ExportStorageBill.class)
public class ExportStorageBill_ { 

    public static volatile SingularAttribute<ExportStorageBill, Bill> billBillID;
    public static volatile SingularAttribute<ExportStorageBill, Storage> storageStorageID;
    public static volatile SingularAttribute<ExportStorageBill, Float> totalMoney;
    public static volatile SingularAttribute<ExportStorageBill, Integer> time;
    public static volatile SingularAttribute<ExportStorageBill, Integer> exportBillID;

}