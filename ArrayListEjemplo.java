
package controller;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;
/**
 *
 * @author Leonardo
 */
public class ArrayListEjemplo {
    public static void main(String [] args){
        ArrayList lista; //declarar un arreglo dinamico
        lista = new ArrayList(); //Dar el espacio inicial de memoria
        Alumno alu = new Alumno (555, "ABEL ABAD", 2022);
        lista.add("Mensaje 1");
        lista.add("Mensaje 2");
        lista.add("Mensaje 3");
        lista.add("Mensaje 4");
        lista.add("Saludos");
        //Se ingresa otro tipo de dato
        lista.add(alu);
        
        //Muestra de lo guerdado
        for (Object e: lista ){
               if(e instanceof Alumno) {
                   System.out.println((Alumno)e);
               }else {
                   System.out.println((String)e);
               }
           }

           System.out.println("El indice 2 contiene " + lista.get(2)); //mostrar el elemento de indice 2
           System.out.println("La lista con un elemento eliminado tiene " + lista.size() + " elementos" );
           lista.remove(alu);
           for (Object e: lista ){
               if (e instanceof Alumno) {
                   System.out.println((Alumno)e);
               }else {
                   System.out.println((String)e);
               }
           }
    }
}
