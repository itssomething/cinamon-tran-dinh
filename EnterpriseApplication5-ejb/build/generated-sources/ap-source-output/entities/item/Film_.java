package entities.item;

import entities.item.MovieTicket;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile SingularAttribute<Film, Integer> filmID;
    public static volatile ListAttribute<Film, MovieTicket> movieTicketList;
    public static volatile SingularAttribute<Film, String> name;
    public static volatile SingularAttribute<Film, Integer> length;

}