package edu.saul.hernandez.actividades.retos;

import java.util.HashMap;
import java.util.Map;

public class reto2 {
    public static void main(String[] args) {
        String texto = "El rey de Parangaricutirimícuaro se quiere desparangaricutirimicuarizar, el que lo desparangaricutirimicuarize un buen desparangaricutirimicuarizador será";
        encontrarDuplicado(texto);
            }

        
            public static void encontrarDuplicado(String texto) {
        Map<Character, Integer> mapaFrecuencia = new HashMap<>();

        for (char c : texto.toCharArray()) {
            mapaFrecuencia.put(c, mapaFrecuencia.getOrDefault(c, 0) + 1);
        }

        System.out.println("Caracteres duplicados:");
        for (Map.Entry<Character, Integer> entrada : mapaFrecuencia.entrySet()) {
            if (entrada.getValue() > 1) {
                System.out.println(entrada.getKey() + " aparece " + entrada.getValue() + " veces.");
            }
        }
    }
}