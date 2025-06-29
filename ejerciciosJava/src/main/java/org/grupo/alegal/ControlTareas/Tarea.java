package org.grupo.alegal.ControlTareas;

public class Tarea {
    // Atributos
    private String descripcion;
    private Boolean completada;

    // Constructor.
    public Tarea(String descripcion, Boolean completada) {
        this.descripcion =  descripcion;
        this.completada = completada;
    }

    // Metodo marcarComoCompletada
    public void marcarComoCompletada() {
        this.completada = true;
    }

}
