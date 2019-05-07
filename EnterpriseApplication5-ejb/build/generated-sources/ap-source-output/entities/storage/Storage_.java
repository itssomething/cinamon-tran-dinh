package entities.storage;

import entities.staff.StorageEmployee;
import entities.storage.ExportStorageBill;
import entities.storage.ImportStorageBill;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Storage.class)
public class Storage_ { 

    public static volatile ListAttribute<Storage, ExportStorageBill> exportStorageBillList;
    public static volatile SingularAttribute<Storage, String> address;
    public static volatile ListAttribute<Storage, StorageEmployee> storageEmployeeList;
    public static volatile ListAttribute<Storage, ImportStorageBill> importStorageBillList;
    public static volatile SingularAttribute<Storage, String> name;
    public static volatile SingularAttribute<Storage, Integer> storageID;

}