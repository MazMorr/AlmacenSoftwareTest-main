package modelo;

import util1.Date;
import java.io.Serializable;

public class Movement implements Serializable{
    String product;
    String movementType;
    String date;

    public Movement(String product, String movementType, String date) {
        this.product = product;
        this.movementType = movementType;
        this.date = date;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getMovementType() {
        return movementType;
    }
    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
