package controller;
import model.GenericoEjemplo;
import model.Alumno;
/**
 *
 * @author Leonardo
 */
public class TestGenerico {
    public static void main(String [] args){
        GenericoEjemplo<Integer> g1 = new GenericoEjemplo<>(10);
        System.out.println("g1 + 5 es "  + (g1.getDato() + 5));
        
        // Cambié el nombre de g1 a g2 para la nueva instancia
        GenericoEjemplo<Alumno> g2 = new GenericoEjemplo<>(new Alumno(77777, "ANA ABAD", 2025));
        System.out.println("El alumno es: \n" + g2.getDato());
    }
}
