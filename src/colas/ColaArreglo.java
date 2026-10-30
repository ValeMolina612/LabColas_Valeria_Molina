package colas;

/**
 * Molina Rosas Maria Valeria 
 * 30/octubre/22026
 * 
 */
public class ColaArreglo {

    // Arreglo que almacena los elementos de la cola. 
    private int[] datos;

    // Índice del elemento que está al frente (el próximo en salir). 
    private int frente;

    //Índice del último elemento insertado. 
    private int fin;

    /** Cantidad de elementos que hay actualmente en la cola. */
    private int tamanio;

    /** Número maximo de elementos que puede almacenar la cola. */
    private int capacidad;
 
    /**
     * Crea una cola vacía con la capacidad indicada
     **/
    public ColaArreglo(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamanio = 0;
    }

    /**
     * Indica si la cola no tiene elementos.
     *
     * @return true si está vacía
     */
    public boolean estaVacia() {
        return tamanio == 0;
    }

    /**
     * Indica si la cola alcanzó su capacidad máxima.
     *
     * @return true si está llena
     */
    public boolean estaLlena() {
        return tamanio == capacidad;
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
     * @param valor valor a encolar
     * @throws IllegalStateException si la cola está llena
     */
    public void encolar(int valor) {
        if (estaLlena()) {
            throw new IllegalStateException("La cola está llena");
        }
        fin = (fin + 1) % capacidad; // avance circular
        datos[fin] = valor;
        tamanio++;
    }

    /**
     * Elimina y devuelve el elemento del frente. Complejidad O(1).
     *
     * @return el elemento que estaba al frente
     * @throws IllegalStateException si la cola está vacía
     */
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = datos[frente];
        frente = (frente + 1) % capacidad;
        tamanio--;
        return valor;
    }

    /**
     * Consulta el elemento del frente sin eliminarlo. Complejidad O(1).
     * @return el elemento del frente
     */
    public int frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return datos[frente];
    }

    /**
     * devuelve el índice actual de fin es util para analizar el giro circular
     *
     * @return índice de la última posición ocupada
     */
    public int indiceFin() {
        return fin;
    }
}
