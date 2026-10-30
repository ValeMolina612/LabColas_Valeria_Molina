package colas;

/**
 * Molina Rosas Maria Valeria 
 * 30/octubre/2026
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        System.out.println("Entorno listo");

        ColaArreglo cola = new ColaArreglo(3);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.println("Sale: " + cola.desencolar());   // 10
        cola.encolar(40);                                   // reutiliza la posición 0
        System.out.println("Frente: " + cola.frente());     // 20
        System.out.println("Tamaño: " + cola.tamanio());    // 3
        System.out.println("¿Llena? " + cola.estaLlena());  // true


        ColaEnlazada<String> nombres = new ColaEnlazada<>();
        nombres.encolar("Ana");
        nombres.encolar("Luis");
        nombres.encolar("María");
        System.out.println(nombres.desencolar());  // Ana
        System.out.println(nombres.frente());      // Luis
        System.out.println(nombres.tamanio());     // 2
    }
}
