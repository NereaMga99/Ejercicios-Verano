package org.grupo.alegal.Coche;

public class Coche {
    //Atributos.
    private String color;
    private String modelo;
    private int anyo;

    // Constructor.
    public Coche(String color, String modelo, int anyo) {
        this.color = color;
        this.modelo = modelo;
        this.anyo = anyo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnyo() {
        return this.anyo;
    }
}
