package entities.item;

import entities.item.Author;
import entities.item.Book;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Credit.class)
public class Credit_ { 

    public static volatile SingularAttribute<Credit, Book> bookProductProductID;
    public static volatile SingularAttribute<Credit, Author> authorAuthorID;
    public static volatile SingularAttribute<Credit, Integer> id;

}