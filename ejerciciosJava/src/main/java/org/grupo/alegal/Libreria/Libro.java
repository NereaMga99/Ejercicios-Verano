package org.grupo.alegal.Libreria;

public class Libro {
    // Atributos.
    private String titulo;
    private String autor;
    private Boolean disponible;

    // Constructor.
    public Libro (String titulo, String autor, Boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return this.titulo;
    }

    // Metodo devolver
    public void devolver() {
        this.disponible = false;
    }

    // Metodo prestar.
    public void prestar() {
        if (!this.disponible) {
            System.out.println("Error, no disponible");
        } else {
            this.disponible = false;
        }
    }
}
