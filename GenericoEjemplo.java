
package model;

/**
 *
 * @author Leonardo
 */
public class GenericoEjemplo <T>{ 
    private T dato;
    
    public GenericoEjemplo (T dato) {
        this.dato = dato;
        
    }
    public T getDato() {
        return dato;
    }
}
