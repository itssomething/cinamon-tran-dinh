package entities.item;

import entities.item.Credit;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:36:09")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, Integer> dob;
    public static volatile SingularAttribute<Author, String> name;
    public static volatile SingularAttribute<Author, Integer> authorID;
    public static volatile ListAttribute<Author, Credit> creditList;

}