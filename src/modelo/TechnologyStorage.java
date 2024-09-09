package modelo;

import util1.Date;
import java.io.Serializable;

public class TechnologyStorage extends Storage implements Serializable {

    private double cant;
    private String type;
    private double totalSpace;
    private String producto;
    private int posProducto;
    private String fecha;
    
    public TechnologyStorage(String type,double cant,double length, double width, double height,String producto,int posProducto,String fecha) {
        super(length, width, height);
        this.cant = cant;
        this.type = type;
        this.producto=producto;
        this.posProducto = posProducto;
        this.fecha = fecha;
        this.totalSpace = 0;
    }

    public int getPosProducto() {
        return posProducto;
    }

    public void setPosProducto(int posProducto) {
        this.posProducto = posProducto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double volumen() {
        double volumen = getLength()*getWidth()*getHeight();
        return volumen;
    }

    @Override
    public double getTotalSpace() {
        return totalSpace;
    }

    @Override
    public String toString() {
        return type;
    }
    
     

}
