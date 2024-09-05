
package excepciones;


public class ExceptionArregloLleno extends Exception{

    public ExceptionArregloLleno(String message) {
        super("Imposible realizar operacion: ARREGLO LLENO");
    }

    public ExceptionArregloLleno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
