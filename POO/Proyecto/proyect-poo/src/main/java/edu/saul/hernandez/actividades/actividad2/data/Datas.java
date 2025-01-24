package edu.saul.hernandez.actividades.actividad2.data;

public class Datas {
    private String name;
    public static String[] nombres= {"Marco", "Pepe", "Toño", "Chris", "Saul"};

    public Datas(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }
}

