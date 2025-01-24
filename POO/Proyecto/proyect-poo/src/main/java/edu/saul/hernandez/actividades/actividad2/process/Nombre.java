package edu.saul.hernandez.actividades.actividad2.process;

import edu.saul.hernandez.actividades.actividad2.data.Datas;

public class Nombre {

    public static boolean validateName(String name) {
        String storedName = name.toLowerCase();
        boolean isValid = false;
        for (String nameToValidate : Datas.nombres) {
            if (nameToValidate.toLowerCase().equals(storedName)) {
                isValid = true;
            }
        }
        return isValid;
    }
}