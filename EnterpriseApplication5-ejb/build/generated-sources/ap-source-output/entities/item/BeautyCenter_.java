package entities.item;

import entities.item.BeautyService;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(BeautyCenter.class)
public class BeautyCenter_ { 

    public static volatile SingularAttribute<BeautyCenter, String> address;
    public static volatile SingularAttribute<BeautyCenter, Integer> beautyCenterID;
    public static volatile SingularAttribute<BeautyCenter, String> name;
    public static volatile ListAttribute<BeautyCenter, BeautyService> beautyServiceList;

}