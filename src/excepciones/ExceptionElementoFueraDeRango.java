
package excepciones;

public class ExceptionElementoFueraDeRango extends Exception{

    public ExceptionElementoFueraDeRango(String message) {
        super("Elemento fuera del rango del arreglo");
    }

    public ExceptionElementoFueraDeRango() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
