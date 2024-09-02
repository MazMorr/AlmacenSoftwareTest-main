package Model;

import Util.TechnologyStorageType;

public class TechnologyStorage extends Storage {

    private int cant;
    private TechnologyStorageType type;
    //private double totalSpace;
    private Product product;


    public TechnologyStorage(TechnologyStorageType type,int cant,double length, double width, double height) {
        super(length, width, height);
        this.cant = cant;
        this.type = type;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public TechnologyStorageType getType() {
        return type;
    }

    public void setType(TechnologyStorageType type) {
        this.type = type;
    }

    public double getOccupiedSpace() {
        double space = getLength()*getWidth()*getHeight();
        return space*cant;
    }


}
