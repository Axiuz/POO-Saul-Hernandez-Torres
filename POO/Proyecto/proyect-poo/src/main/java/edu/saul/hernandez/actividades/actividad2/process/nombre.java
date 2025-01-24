package edu.saul.hernandez.actividades.actividad2.process;


public class numeros {

    public class NameValidator {
        public static boolean validateName(String name){
            String storedName = name.toLowerCase();
            boolean isValid = false;
            for(String nameToValidate: Data.nombres){
                if(nameToValidate.toLowerCase().equals(storedName)){
                    isValid = true;
                    break;
                }
            }
            return isValid;
        }
    }