package modelo;
import util1.Date;
import java.io.Serializable;


public class Product implements Serializable {
    private String id;
    private String name;
    private double price;
    private double capacity;
    private Date expireDate;
    private String type;


    public Product(String id, String name, double price, double capacity, Date expireDate,String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.expireDate = expireDate;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
