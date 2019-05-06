/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.item;

import entities.purchase_system.Cart;
import entities.storage.ImportStorageBill;
import entities.item.Electronic;
import entities.item.Household;
import entities.item.Book;
import entities.item.Clothes;
import entities.item.Toys;
import entities.item.Mobile;
import entities.item.Cosmetic;
import entities.item.Computer;
import entities.item.Cars;
import entities.item.Digital;
import entities.item.Accessory;
import entities.purchase_system.CartProduct;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manh
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProductID", query = "SELECT p FROM Product p WHERE p.productID = :productID")
    , @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name")
    , @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price")
    , @NamedQuery(name = "Product.findByStock", query = "SELECT p FROM Product p WHERE p.stock = :stock")
    , @NamedQuery(name = "Product.findByBrand", query = "SELECT p FROM Product p WHERE p.brand = :brand")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductID")
    private Integer productID;
//    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Price")
    private Double price;
    @Column(name = "Stock")
    private Integer stock;
//    @Size(max = 255)
    @Column(name = "Brand")
    private String brand;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private LearningCourse learningCourse;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private BeautyService beautyService;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Cosmetic cosmetic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productProductID")
    private List<CartProduct> cartProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productProductID")
    private List<Image> imageList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Cars cars;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Book book;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Computer computer;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Electronic electronic;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Digital digital;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private MovieTicket movieticket;
    @JoinColumn(name = "CartCartID", referencedColumnName = "CartID")
    @ManyToOne(optional = false)
    private Cart cartCartID;
    @JoinColumn(name = "DiscountDiscountID", referencedColumnName = "DiscountID")
    @ManyToOne(optional = false)
    private Discount discountDiscountID;
    @JoinColumn(name = "ImportStorageBillImportBillID", referencedColumnName = "ImportBillID")
    @ManyToOne(optional = false)
    private ImportStorageBill importStorageBillImportBillID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Toys toys;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private ProductStat productStat;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Mobile mobile;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Clothes clothes;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Household household;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Accessory accessory;

    public Product() {
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LearningCourse getLearningCourse() {
        return learningCourse;
    }

    public void setLearningcourse(LearningCourse learningcourse) {
        this.learningCourse = learningCourse;
    }

    public BeautyService getBeautyService() {
        return beautyService;
    }

    public void setBeautyservice(BeautyService beautyService) {
        this.beautyService = beautyService;
    }

    public Cosmetic getCosmetic() {
        return cosmetic;
    }

    public void setCosmetic(Cosmetic cosmetic) {
        this.cosmetic = cosmetic;
    }

    @XmlTransient
    public List<CartProduct> getCartProductList() {
        return cartProductList;
    }

    public void setCartProductList(List<CartProduct> cartProductList) {
        this.cartProductList = cartProductList;
    }

    @XmlTransient
    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Electronic getElectronic() {
        return electronic;
    }

    public void setElectronic(Electronic electronic) {
        this.electronic = electronic;
    }

    public Digital getDigital() {
        return digital;
    }

    public void setDigital(Digital digital) {
        this.digital = digital;
    }

    public MovieTicket getMovieTicket() {
        return movieticket;
    }

    public void setMovieticket(MovieTicket movieTicket) {
        this.movieticket = movieticket;
    }

    public Cart getCartCartID() {
        return cartCartID;
    }

    public void setCartCartID(Cart cartCartID) {
        this.cartCartID = cartCartID;
    }

    public Discount getDiscountDiscountID() {
        return discountDiscountID;
    }

    public void setDiscountDiscountID(Discount discountDiscountID) {
        this.discountDiscountID = discountDiscountID;
    }

    public ImportStorageBill getImportStorageBillImportBillID() {
        return importStorageBillImportBillID;
    }

    public void setImportStorageBillImportBillID(ImportStorageBill importStorageBillImportBillID) {
        this.importStorageBillImportBillID = importStorageBillImportBillID;
    }

    public Toys getToys() {
        return toys;
    }

    public void setToys(Toys toys) {
        this.toys = toys;
    }

    public ProductStat getProductStat() {
        return productStat;
    }

    public void setProductstat(ProductStat productStat) {
        this.productStat = productStat;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Household getHousehold() {
        return household;
    }

    public void setHousehold(Household household) {
        this.household = household;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Product[ productID=" + productID + " ]";
    }
    
}
