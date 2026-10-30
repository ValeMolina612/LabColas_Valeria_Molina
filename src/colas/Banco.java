package colas;

import java.util.Scanner;

/**
 *Maria Valeria Molina Rosas 
 *30/octubre/2026  
*/
public class Banco {

    /**
     * Muestra un menú en ciclo hasta que el usuario elige salir.
     */
    public static void main(String[] args) {
        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            // Validación: evita que el programa falle si no se escribe un número
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Opción inválida. Escribe un número del 1 al 5: ");
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpia el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío.");
                    } else {
                        fila.encolar(nombre);
                        System.out.println(nombre + " se formó en la fila.");
                    }
                    break;
                case 2:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Atendiendo a: " + fila.desencolar());
                    }
                    break;
                case 3:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Sigue: " + fila.frente());
                    }
                    break;
                case 4:
                    System.out.println("Clientes en espera: " + fila.tamanio());
                    break;
                case 5:
                    System.out.println("Cerrando el banco. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
