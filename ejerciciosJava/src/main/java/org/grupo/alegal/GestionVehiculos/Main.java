package org.grupo.alegal.GestionVehiculos;

public class Main {
    public static void main(String[] args) {
    Vehiculo[] vehiculos = new Vehiculo[] {
         new Vehiculo("Nissan", "Micra", 2009),
         new Vehiculo("Toyota", "Corolla", 2020),
         new Vehiculo("Ford", "Mustang", 2018),
         new Vehiculo("BMW", "Serie 3", 2022),
         new Vehiculo("Tesla", "Model 3", 2021)
    };

    // El bucle for-each es para recorrer Arrays.
         for (Vehiculo v : vehiculos) {
             if (v.getAnioFabricacion() > 2020) { // Se añade una condicion dentro del Array.
                 System.out.println(v.mostrarDetalles());
             }
         }
    }
}
