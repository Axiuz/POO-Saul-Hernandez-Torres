package edu.saul.hernandez.actividades.retos;

import java.util.Scanner;
public class reto1 {

     public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingresa una palabra para invertir: ");
                String palabra = scanner.nextLine();

                String palabraInvertida = invertirPalabra(palabra);
   
                System.out.println("Palabra invertida: " + palabraInvertida);
            }
        }
    
        public static String invertirPalabra(String palabra) {
            char[] caracteres = palabra.toCharArray();
            String resultado = "";
    
            for (int i = caracteres.length - 1; i >= 0; i--) {
                resultado += caracteres[i];
            }
    
            return resultado;
        }
    }
    