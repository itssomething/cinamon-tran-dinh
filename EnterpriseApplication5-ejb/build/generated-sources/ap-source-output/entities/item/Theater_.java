package entities.item;

import entities.item.MovieTicket;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Theater.class)
public class Theater_ { 

    public static volatile SingularAttribute<Theater, String> address;
    public static volatile SingularAttribute<Theater, Integer> theaterID;
    public static volatile ListAttribute<Theater, MovieTicket> movieTicketList;
    public static volatile SingularAttribute<Theater, String> name;

}