package controladora;
import util1.ListaArreglo;
import modelo.*;
import excepciones.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Almacen implements Serializable{
    ListaArreglo<Product> productos;
    ListaArreglo<TechnologyStorage> almacenamientos;
    ListaArreglo<Movement> movimientos;
    Admin admin;
    final double totalSpace =12000;
    double actualSpace=0;
    double espacioOcupado = 0;
    int pos;
    
    public Almacen() {
       productos = new ListaArreglo<Product>();
       almacenamientos = new ListaArreglo<TechnologyStorage>();
       movimientos = new ListaArreglo<Movement>();
       this.admin=new Admin();
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
    public double getActualSpace() {
        return actualSpace;
    }

    public void setActualSpace(double actualSpace) {
        this.actualSpace = actualSpace;
    }
     
    
    public ListaArreglo<Product> getProductos() {
        return productos;
    }

    public void setProductos(ListaArreglo<Product> productos) {
        this.productos = productos;
    }

    public ListaArreglo<TechnologyStorage> getAlmacenamientos() {
        return almacenamientos;
    }

    public void setAlmacenamientos(ListaArreglo<TechnologyStorage> almacenamientos) {
        this.almacenamientos = almacenamientos;
    }

    public ListaArreglo<Movement> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ListaArreglo<Movement> movimientos) {
        this.movimientos = movimientos;
    }

    public void addProducto(Product _producto)throws ExceptionArregloLleno {
        productos.aniadir(_producto);
    }
    public void addAlmacenamiento(TechnologyStorage _almacenamiento)throws ExceptionArregloLleno {
        almacenamientos.aniadir(_almacenamiento);
    }
    public void addMovimiento(Movement _movimiento)throws ExceptionArregloLleno {
        movimientos.aniadir(_movimiento);
    }
    public void borrarProducto(int posProducto)throws ExceptionArregloVacio,ExceptionElementoFueraDeRango{
        if(0<=posProducto && productos.cantElementos()>0){
            productos.eliminar(posProducto);    
        }else{
            throw new ExceptionElementoFueraDeRango();
        }
    }
    
    public void borrarAlmacenamiento(int posAlmacenamiento)throws ExceptionArregloVacio,ExceptionElementoFueraDeRango{
        if(0<=posAlmacenamiento && almacenamientos.cantElementos()>0){
            almacenamientos.eliminar(posAlmacenamiento);    
        }else{
            throw new ExceptionElementoFueraDeRango();
        }                  
    }
    
    public void borrarMovimiento(int posMovimiento)throws ExceptionArregloVacio,ExceptionElementoFueraDeRango{
        if(0<=posMovimiento && movimientos.cantElementos()>0){
            movimientos.eliminar(posMovimiento);    
        }else{
            throw new ExceptionElementoFueraDeRango();
        }                  
    }
    
    
    public double espacioOcupado(int y) throws ExceptionElementoFueraDeRango{
        
        espacioOcupado += almacenamientos.obtener(y).volumen();
        
        return espacioOcupado; 
    }
    
    public double eliminarEspacioOcupado(double volumen,int y) throws ExceptionElementoFueraDeRango{
            
        espacioOcupado -= almacenamientos.obtener(y).volumen();
            
        return espacioOcupado; 
    }
    public void exportarInformacion(String rutaFichero) throws FileNotFoundException, IOException, ExceptionElementoFueraDeRango {
    
    File file = new File(rutaFichero);
    FileOutputStream outputStream = new FileOutputStream(file);
    ObjectOutputStream output = new ObjectOutputStream(outputStream);
     
        try {
            output.writeInt(pos);
            
            output.writeInt(productos.cantElementos());
            
            for (int i = 0; i < productos.cantElementos(); i++) {
                Object producto = productos.obtener(i);
                output.writeObject(producto);
            }
            output.writeInt(almacenamientos.cantElementos());
            
            for (int i = 0; i < almacenamientos.cantElementos(); i++) {
                Object almacenamiento = almacenamientos.obtener(i);
                output.writeObject(almacenamiento);
            }
            output.writeInt(movimientos.cantElementos());
            
            for (int i = 0; i < movimientos.cantElementos(); i++) {
                Object movimiento = movimientos.obtener(i);
                output.writeObject(movimiento);
            }
            
            output.flush();
            output.close();
            JOptionPane.showMessageDialog(null, "Información exportada correctamente.");
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importarInformacion(String rutaFichero) throws FileNotFoundException, IOException, ClassNotFoundException, ExceptionArregloLleno, IOException{
        File file = new File(rutaFichero);
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(fileInput);
        
        pos = inputStream.readInt();
        
        int cantElementos=inputStream.readInt();
        
        for(int i=0;i<cantElementos;i++){
            productos.aniadir((Product) inputStream.readObject());
         }
        int cantElementosAlmacenamiento = inputStream.readInt();
        for(int i=0;i<cantElementosAlmacenamiento;i++){
            almacenamientos.aniadir((TechnologyStorage) inputStream.readObject());
        }
        int cantElementosMovimientos = inputStream.readInt();
        for(int i=0;i<cantElementosMovimientos;i++){
            movimientos.aniadir((Movement) inputStream.readObject());
        }
         JOptionPane.showMessageDialog(null, "Cargando datos");
         
         inputStream.close();
    } 
    
    
    
    public void importarContrasena(String rutaFichero) throws FileNotFoundException, IOException{
        File file = new File(rutaFichero);
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(fileInput);
        
        try {
            this.admin = (Admin) inputStream.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(admin);
        inputStream.close();
    }
}