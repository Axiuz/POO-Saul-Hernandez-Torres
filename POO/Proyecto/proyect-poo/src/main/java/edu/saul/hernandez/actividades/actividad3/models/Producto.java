package edu.saul.hernandez.actividades.actividad3.models;
/**
 * Clase que representa un producto.
 */
public class Producto {

        private String description;
        private double price;
        private String code;
        private String type;
        private double tax;

        /**
         * Constructor de la clase Product que recibe los siguientes parámetros:
         * @param descripcion
         * @param precio
         * @param codigo
         * @param tipo
         * @param impuesto
         */
        public Producto(String descripcion, double precio, String codigo, String tipo, double impuesto) {
            setDescription(description);
            setPrice(price);
            setCode(code);
            setType(type);
            setTax(tax);
        }


        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }

        public String getCode() {
            return code;
        }

        public String getType() {
            return type;
        }

        public double getTax() {
            return tax;
        }
        /**
         * Metodo que asigna la descripción del producto y valida que no esté vacía.
         * @param description
         */
        public void setDescription(String description) {
            if (description == null || description.trim().isEmpty()) {
                throw new IllegalArgumentException("La descripción no puede estar vacía.");
            }
            this.description = description;
        }

        /**
         * Metodo que asigna el precio del producto y valida que no sea negativo.
         * @param price
         */
        public void setPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo.");
            }
            this.price = price;
        }

        /**
         * Metodo que asigna el código del producto y valida que no esté vacío.
         * @param code
         */
        public void setCode(String code) {
            if (code == null || code.trim().isEmpty()) {
                throw new IllegalArgumentException("El código no puede estar vacío.");
            }
            this.code = code;
        }
        /**
         * Metodo que asigna el tipo del producto y valida que no esté vacío.
         * @param type
         */
        public void setType(String type) {
            if (type == null || type.trim().isEmpty()) {
                throw new IllegalArgumentException("El tipo no puede estar vacío.");
            }
            this.type = type;
        }
        /**
         * Metodo que asigna el impuesto del producto y valida que no sea negativo.
         * @param tax
         */
        public void setTax(double tax) {
            if (tax < 0) {
                throw new IllegalArgumentException("El impuesto no puede ser negativo.");
            }
            this.tax = tax;
        }


    }