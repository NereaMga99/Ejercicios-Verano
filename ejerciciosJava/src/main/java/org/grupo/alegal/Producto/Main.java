package org.grupo.alegal.Producto;

public class Main {
    public static void main(String[] args) {
        Producto[] productos= new Producto[] {
            new Producto("Patata", 3.25, 10 ),
            new Producto("Pepino", 4.3, 5)
        };
        productos[0].vender(5);
        productos[0].vender(6);
    }
}
