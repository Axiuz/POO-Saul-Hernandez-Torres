package edu.saul.hernandez.ACTIVIDADES.retos;

public class reto3 {
    public static void main(String[] args) {
        int[] numeros = {34342523, 1579923859, 69, 24221, 198688823, 762346783, 4324342};
    
        int minimo = encontrarMinimo(numeros);
    
            System.out.println("El valor más pequeño en el array es: " + minimo);
        }
    
        public static int encontrarMinimo(int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("El array no puede estar vacío.");
            }
    
            int minimo = array[0];

            for (int num : array) {
                if (num < minimo) {
                    minimo = num;
                }
            }
    
            return minimo;
        }
    }
    

