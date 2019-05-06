package entities.item;

import entities.item.Film;
import entities.item.Product;
import entities.item.Theater;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(MovieTicket.class)
public class MovieTicket_ { 

    public static volatile SingularAttribute<MovieTicket, String> seat;
    public static volatile SingularAttribute<MovieTicket, Theater> theaterTheaterID;
    public static volatile SingularAttribute<MovieTicket, Product> product;
    public static volatile SingularAttribute<MovieTicket, Integer> productProductID;
    public static volatile SingularAttribute<MovieTicket, Integer> time;
    public static volatile SingularAttribute<MovieTicket, Film> filmFilmID;

}