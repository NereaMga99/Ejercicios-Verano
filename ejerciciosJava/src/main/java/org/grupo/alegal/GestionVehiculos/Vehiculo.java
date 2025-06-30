package org.grupo.alegal.GestionVehiculos;

import java.time.Year;

public class Vehiculo {
    // atributos
    private String marca;
    private String modelo;
    private int anioFabricacion;

    // constructor
    public Vehiculo (String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    // Getter y Setters.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    // Metodo mostrarDetalles.
    public String mostrarDetalles () {
        return "El vehiculo tiene de marca " + getMarca() + ", con el modelo " + getModelo()
                + " y con anio de fabricacion: " + getAnioFabricacion();
    }
}
