package Model;

import Util.Date;
import Util.MovementType;

public class Movement {
    private int movementId;
    Product product;
    MovementType movementType;
    Date date;

    public Movement(int movementId, Product product, MovementType movementType, Date date) {
        this.movementId = movementId;
        this.product = product;
        this.movementType = movementType;
        this.date = date;
    }
    public int getMovementId() {
        return movementId;
    }
    public void setMovementId(int movementId) {
        this.movementId = movementId;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public MovementType getMovementType() {
        return movementType;
    }
    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
