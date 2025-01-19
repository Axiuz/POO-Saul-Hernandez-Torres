package edu.saul.hernandez.ACTIVIDADES.actividad1.process;

import java.util.ArrayList;
import java.util.List;

import edu.saul.hernandez.ACTIVIDADES.actividad1.models.Car;

public class StockManager {
    ArrayList<Car> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }

    /**
     * @param modelo 
     * @param marca 
     * @param numeroPuertas
     * @param color 
     */
    public void addCar(String modelo, String marca, int numeroPuertas, String color){
        Car car= new Car(modelo,marca,numeroPuertas,color);
        stock.add(car);

    }

    /**
     * @return 
     */
    public List<Car> getStock(){
        return this.stock;
    }
}