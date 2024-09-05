
package excepciones;

public class ExceptionArregloVacio extends Exception {

    public ExceptionArregloVacio(String message) {
        super("Imposible realizar operacion: ARREGLO VACIO");
    }

    public ExceptionArregloVacio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
