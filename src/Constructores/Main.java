package Constructores;

/**
 *
 * @author Yo :( 
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche = new Coche(2, 5);
        
        Persona pers = new Persona("México", "David");
        
        Escuela escuela = new Escuela(15, "Pedro", "Sergio");
        
        Agenda agenda = new Agenda(55123578, "Sergio");
        
        Sopa sopa = new Sopa("Vegetariana", "Zanahoria");
    }
    
}
