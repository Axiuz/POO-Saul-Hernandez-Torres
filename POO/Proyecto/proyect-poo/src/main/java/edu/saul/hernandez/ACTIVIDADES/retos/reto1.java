package edu.saul.hernandez.ACTIVIDADES.retos;

import java.util.Scanner;
public class reto1 {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingresa un texto: ");
                String texto = scanner.nextLine();
      
                String textoInvertido = invertirTexto(texto);
                System.out.println("Texto invertido: " + textoInvertido);
            }
        }
    
        public static String invertirTexto(String texto) {
            StringBuilder sb = new StringBuilder(texto);
            return sb.reverse().toString();
        }
    }
    

    

