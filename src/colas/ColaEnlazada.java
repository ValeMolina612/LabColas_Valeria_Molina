package colas;

/**
 * Molina Rosas Maria Valeria
 * 30/octubre/2026
 **/
public class ColaEnlazada<T> {

    /** Primer nodo de la cola (el próximo en salir). */
    private Nodo<T> frente;

    /** Último nodo de la cola (donde se inserta). */
    private Nodo<T> fin;

    /** Cantidad de elementos en la cola. */
    private int tamanio;

    /**
     * Indica si la cola no tiene elementos.
     *
     * @return true si está vacía
     */
    public boolean estaVacia() {
        return frente == null;
    }

    /**
     * Devuelve la cantidad de elementos de la cola.
     *
     * @return número de elementos
     */
    public int tamanio() {
        return tamanio;
    }

    /**
     * Agrega un elemento al final de la cola. Complejidad O(1).
     *
     * @param valor elemento a encolar
     */
    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (estaVacia()) {
            frente = nuevo;          // cola vacía: el nuevo es también el frente
        } else {
            fin.siguiente = nuevo;   // cola con elementos: se enlaza tras el último
        }
        fin = nuevo;
        tamanio++;
    }

   
     //Elimina y devuelve el elemento del frente. Complejidad O(1).
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // la cola quedó vacía
        }
        tamanio--;
        return valor;
    }

    // Consulta el elemento del frente sin eliminarlo. Complejidad O(1).
    
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    // ------------------- Ejercicios de refuerzo (nivel básico) -------------------

    /**
     * Muestra todos los elementos del frente al final, sin destruir la cola.
     */
    public void imprimirCola() {
        if (estaVacia()) {
            System.out.println("[ cola vacía ]");
            return;
        }
        StringBuilder sb = new StringBuilder("Frente -> ");
        Nodo<T> actual = frente;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(" | ");
            }
            actual = actual.siguiente;
        }
        sb.append(" <- Fin");
        System.out.println(sb);
    }

    /**
     * Deja la cola sin elementos.
     */
    public void vaciar() {
        frente = null;
        fin = null;
        tamanio = 0;
    }
}
