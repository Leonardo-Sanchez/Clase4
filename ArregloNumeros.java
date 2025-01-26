
package controller;
import model.Alumno;
/**
 *
 * @author Leonardo
 */
public class ArregloNumeros {
    public static void main(String [] args){
        int n1[];  // declaracion de una variable arreglo
        // Antes de reservarse memoria a una variable 
        // la variable es NULA(nul)
        n1=new int[5]; // construccion del objeto n1
                      // reservacion de memoria (5 elementos de tipo entero
        // Los indices son enteros con memoria reservada, usar la variable
        //Los indices van desde cero hasta tamano_arreglo -1
        n1[0] = 10; //que la posicion del indice 0 se asigna se guarda el valor 10
        n1[1] = 15;
        n1[2] = 18;
        n1[3] = 7;
        n1[4] = 11;
        
        
       
        //mostrar 
        for(int i = 0; i<n1.length; i++) {
           System.out.println("n1 ["+i+"] es " + n1[i]);

                    
        }
        
        Alumno alumnos[], alum1;
        
        alum1 = null; //justo despues de haber declarado el objeto alumno
        if (alum1 == null){
            System.out.println("alum1 sin memoria");
            
        }else {
        
        System.out.println(alum1);
    }
}
}
