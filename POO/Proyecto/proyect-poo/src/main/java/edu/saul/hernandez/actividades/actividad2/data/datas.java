package edu.saul.hernandez.actividades.actividad2.ui;

public class datas {
    private String name;
    public static String[] nombres= {"Marco", "Pepe", "Toño", "Chris", "Saul"};

    public Data(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }
}

