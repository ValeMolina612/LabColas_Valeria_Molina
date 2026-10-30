package colas;

/**
 * Molina Rosas Maria Valeria 
 *30/octubre/2026
 */
public class Nodo<T> {

    /** Dato almacenado en el nodo. */
    T dato;

    /** Referencia al siguiente nodo null si es el ultimo */
    Nodo<T> siguiente;

    /**
     * Crea un nodo con el dato indicado y sin siguiente.
     *
     * @param dato valor que guardará el nodo
     */
    Nodo(T dato) {
        this.dato = dato;
    }
}
