package edu.saul.hernandez.actividades.actividad3.process;

public class CalculadorPrecio {
        public static double getPrice(double price, double utility) {
            double profit = price * utility / 100;
            double finalPrice = price + profit;
            double tax = finalPrice * 0.16;
            return finalPrice + tax;
        }



    }