package entities.item;

import entities.item.Credit;
import entities.item.Product;
import entities.item.Publisher;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Product> product;
    public static volatile SingularAttribute<Book, Integer> productProductID;
    public static volatile SingularAttribute<Book, Publisher> publisherPublsiherID;
    public static volatile SingularAttribute<Book, Integer> publicDate;
    public static volatile ListAttribute<Book, Credit> creditList;

}