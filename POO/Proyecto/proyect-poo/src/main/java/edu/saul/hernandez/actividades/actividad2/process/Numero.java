package edu.saul.hernandez.actividades.actividad2.process;
import java.util.ArrayList;

public class Numero {

    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i += 2) {
            lista.add(i);
        }
        return lista;
    }
}
