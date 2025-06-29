package org.grupo.alegal.Estudiantes;

public class Estudiante {

    // atributos
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    // metodo aprobado / reprobado
    public String calificacion() {
        if (notaPromedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
