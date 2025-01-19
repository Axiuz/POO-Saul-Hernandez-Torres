package edu.saul.hernandez.ACTIVIDADES.actividad1.ui;

import edu.saul.hernandez.ACTIVIDADES.actividad1.models.Car;
import edu.saul.hernandez.ACTIVIDADES.actividad1.process.StockManager;

import java.util.Scanner;   

public class CLI {
    public static void runApp(){
        try (Scanner scan = new Scanner(System.in)) {
            StockManager stockManager = new StockManager();
            showMenu();
            int opcion = scan.nextInt();scan.nextLine();

            while (opcion!=3){
                switch (opcion){
                    case 1:

                        System.out.println("Introduce el numero de puertas");
                        int numPuertas = scan.nextInt();scan.nextLine();
                        System.out.println("Introduce el color");
                        String color = scan.nextLine();
                        System.out.println("Introduce el modelo");
                        String modelo = scan.nextLine();
                        System.out.println("Introduce el marca");
                        String marca = scan.nextLine();
                        stockManager.addCar(modelo,marca,numPuertas,color);
                        break;
                    case 2:
                        int auto=1;
                        for(Car car : stockManager.getStock()){
                            System.out.println("Auto"+auto+":");
                            System.out.println("    Modelo:"+car.getModelo());
                            System.out.println("    Color:"+car.getColor());
                            System.out.println("    NumPuertas:"+car.getNumeroPuertas());
                            System.out.println("    Marca:"+car.getMarca());
                            auto++;
                        }
                        break;
                    default:
                        System.out.println("opcion no valida");
                }
                showMenu();
                opcion = scan.nextInt();
            }
        }
    }
    public static void showMenu(){
        System.out.println("""
                Menu
                1. agregar Carro al catalogo
                2. mostrar catalogo
                3. Salir
                """);
    }
}