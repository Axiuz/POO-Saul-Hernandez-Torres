package edu.saul.hernandez.actividades.actividad3.process;
import edu.saul.hernandez.actividades.actividad3.models.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona el stock de la tienda.
 */
public class StockManager {
    /**
     * Lista de objetos de tipo Producto.
     */
    ArrayList<Producto> products;
    /**
     * Constructor de la clase StockManager.
     */
    public StockManager(){
        this.products = new ArrayList<>();
    }
    /**
     * Metodo que añade un producto a la lista de productos y recibe los siguientes parámetros:
     * @param descripcion
     * @param precio
     * @param codigo
     * @param tipo
     * @param impuesto
     */
    public void addProduct(String descripcion, double precio, String codigo, String tipo, double impuesto){
        Producto newProducts = new Producto(descripcion, precio, codigo, tipo, impuesto);
        products.add(newProducts);
    }
    /**
     * metodo que obtiene la lista de productos.
     * @return Lista de productos.
     */
    public  List<Producto> getProducts(){
        return this.products;
    }

}


