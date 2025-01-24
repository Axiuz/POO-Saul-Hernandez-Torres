package edu.saul.hernandez.actividades.actividad2.ui;

import edu.saul.hernandez.actividades.actividad2.process.Nombre;
import edu.saul.hernandez.actividades.actividad2.process.Numero;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI2 {

    public static void showChat() {
        System.out.println("┌------------------------------┐");
        System.out.println("|            MENÚ              |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Validador de nombres      |");
        System.out.println("| 2. Repetidor de Números      |");
        System.out.println("| 3. Salir                     |");
        System.out.println("└------------------------------┘");
    }

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            showChat();
            System.out.print("Selecciona una opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\nPon un nombre: ");
                        String name = scanner.nextLine();
                        if (Nombre.validateName(name)) {
                            System.out.println("Yasta \n");
                        } else {
                            System.out.println("Nostá \n");
                        }
                        break;
                    case 2:
                        System.out.println("Los pares son:");
                        ArrayList<Integer> numeros = Numero.generarNumeros();
                        System.out.println(numeros);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } else {
                System.out.println("Entrada no válida. Introduce un número.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
