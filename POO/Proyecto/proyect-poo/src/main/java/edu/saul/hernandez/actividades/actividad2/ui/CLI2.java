package edu.saul.hernandez.actividades.actividad2.ui;

public class CLI2 {

import java.util.Scanner;

    public class CLI2 {

        public static void showChat(){
            System.out.println("╔══════════════════════════════╗");
            System.out.println("║            MENÚ              ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1. Validador de nombres      ║");
            System.out.println("║ 2. Números                   ║");
            System.out.println("║ 3. Exit                      ║");
            System.out.println("╚══════════════════════════════╝");
        }

        public static void runApp(){
            showChat();
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();scanner.nextLine();
            while(opcion!=3){
                switch (opcion) {
                    case 1 -> {
                        System.out.println("\nPon un nombre: \n");
                        String name =scanner.nextLine();
                        if(NameValidator.validateName(name)){
                            System.out.println("Ya existe \n");
                        }else{
                            System.out.println("Nosta \n");
                        }
                    }
                    default -> {
                    }
                }
                showChat();
                opcion = scanner.nextInt();scanner.nextLine();
            }
        }

    }

}
