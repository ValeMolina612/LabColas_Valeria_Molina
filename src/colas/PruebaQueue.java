package colas;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Molina Rosas Maria Valeria
 *30/octubre/2026
 */
public class PruebaQueue {

    /**
     * Ejecuta las pruebas de la Parte 3.
     */
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        // Prueba también: Queue<String> cola = new ArrayDeque<>();
        cola.offer("Ana");
        cola.offer("Luis");
        cola.offer("María");
        System.out.println(cola.peek()); // Ana (no la elimina)
        System.out.println(cola.poll()); // Ana (la elimina)
        System.out.println(cola.size()); // 2
        System.out.println(cola);        // [Luis, María]

        Queue<String> cola2 = new ArrayDeque<>();
        cola2.offer("Ana");
        cola2.offer("Luis");
        cola2.offer("María");
        System.out.println(cola2.peek());
        System.out.println(cola2.poll());
        System.out.println(cola2.size());
        System.out.println(cola2);

        Queue<String> vacia = new LinkedList<>();

        try {
            vacia.remove();
            System.out.println("remove(): sin error");
        } catch (NoSuchElementException e) {
            System.out.println("remove(): lanzó NoSuchElementException");
        }

        System.out.println("poll():    " + vacia.poll()); // null

        try {
            vacia.element();
            System.out.println("element(): sin error");
        } catch (NoSuchElementException e) {
            System.out.println("element(): lanzó NoSuchElementException");
        }

        System.out.println("peek():    " + vacia.peek()); // null

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll()); // 10
        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 30
    }
}
