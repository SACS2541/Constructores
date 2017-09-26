package Constructores;

/**
 *
 * @author Alumno
 */
public abstract class Sopa {
    String tipo = "";
    String ingrediente = "";
    
    public abstract void preparacion();
    
    Sopa(String tipo, String ingrediente){
        this.tipo = tipo;
        this.ingrediente = ingrediente;
    }
}
