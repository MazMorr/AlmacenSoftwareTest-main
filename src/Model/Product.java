package Model;
import Util.Date;
import Util.ProductType;

public class Product {
    private int id;
    private String name;
    private double price;
    private int capacity;
    
    private Date expireDate;
    private ProductType type;


    public Product(int id, String name, double price, int capacity, TechnologyStorage technologyStorage, Date expireDate,ProductType type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.technologyStorage = technologyStorage;
        this.expireDate = expireDate;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public TechnologyStorage getTechnologyStorage() {
        return technologyStorage;
    }

    public void setTechnologyStorage(TechnologyStorage technologyStorage) {
        this.technologyStorage = technologyStorage;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
}
