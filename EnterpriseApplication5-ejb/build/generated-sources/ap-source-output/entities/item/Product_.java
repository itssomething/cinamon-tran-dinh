package entities.item;

import entities.item.Accessory;
import entities.item.BeautyService;
import entities.item.Book;
import entities.item.Cars;
import entities.item.Clothes;
import entities.item.Computer;
import entities.item.Cosmetic;
import entities.item.Digital;
import entities.item.Discount;
import entities.item.Electronic;
import entities.item.Household;
import entities.item.Image;
import entities.item.LearningCourse;
import entities.item.Mobile;
import entities.item.MovieTicket;
import entities.item.ProductStat;
import entities.item.Toys;
import entities.purchase_system.Cart;
import entities.purchase_system.CartProduct;
import entities.storage.ImportStorageBill;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T07:54:19")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> productID;
    public static volatile SingularAttribute<Product, Book> book;
    public static volatile SingularAttribute<Product, LearningCourse> learningCourse;
    public static volatile SingularAttribute<Product, Computer> computer;
    public static volatile ListAttribute<Product, CartProduct> cartProductList;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile SingularAttribute<Product, Electronic> electronic;
    public static volatile SingularAttribute<Product, Cosmetic> cosmetic;
    public static volatile SingularAttribute<Product, Integer> stock;
    public static volatile SingularAttribute<Product, String> brand;
    public static volatile SingularAttribute<Product, Digital> digital;
    public static volatile SingularAttribute<Product, MovieTicket> movieticket;
    public static volatile SingularAttribute<Product, Discount> discountDiscountID;
    public static volatile SingularAttribute<Product, Toys> toys;
    public static volatile SingularAttribute<Product, Mobile> mobile;
    public static volatile SingularAttribute<Product, Clothes> clothes;
    public static volatile SingularAttribute<Product, Cars> cars;
    public static volatile SingularAttribute<Product, ProductStat> productStat;
    public static volatile SingularAttribute<Product, Cart> cartCartID;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Household> household;
    public static volatile SingularAttribute<Product, ImportStorageBill> importStorageBillImportBillID;
    public static volatile SingularAttribute<Product, BeautyService> beautyService;
    public static volatile ListAttribute<Product, Image> imageList;
    public static volatile SingularAttribute<Product, Accessory> accessory;

}