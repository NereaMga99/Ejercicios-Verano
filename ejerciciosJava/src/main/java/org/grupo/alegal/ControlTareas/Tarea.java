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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }

    // Metodo marcarComoCompletada
    public void marcarComoCompletada() {
        this.completada = true;
    }

    public String imprimir() {
        return "La " + getDescripcion() + " esta en estado: " + getCompletada();
    }
}
