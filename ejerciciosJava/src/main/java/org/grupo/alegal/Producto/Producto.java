package org.grupo.alegal.Producto;

public class Producto {
    //Atributos
    private String nombre;
    private double precio;
    private int cantidadStock;

    //Constructor
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    // metodo vender
    public void vender(int cantidad) {
        if (this.cantidadStock < cantidad) {
            System.out.println("Error.");
            return;
        }
        this.cantidadStock -= cantidad;
    }

    //metodo comprar
    public void comprar(int cantidad) {
        this.cantidadStock += cantidad;
    }
}
