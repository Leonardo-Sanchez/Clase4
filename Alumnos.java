
package controller;
import model.Alumno;

/**
 *
 * @author Leonardo
 */
public class Alumnos {
    public static void main(String [] args){
        Alumno alumnos[];
        
        alumnos = new Alumno[2];
        
        alumnos[0] = new Alumno(456, "ANA ABAD", 2024);
        alumnos[1] =new Alumno(288, "ABEL ABAS", 2010);
        
        
        for (Alumno a:alumnos){
            System.out.println("Codigo            : " + a.getCod_alum());
            System.out.println("Nombres           : " + a.getNombres());
            System.out.println("A;o de ingreso    : " + a.getAño_ingreso());
        }
    
}
}
