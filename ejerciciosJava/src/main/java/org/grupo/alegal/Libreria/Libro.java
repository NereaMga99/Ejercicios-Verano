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

    // Metodo devolver
    public void devolver() {
        this.disponible = true;
    }

    // Metodo prestar.
    public void prestar() {
        if (!this.disponible) {
            System.out.println("Error, no disponible");
        } else {
            this.disponible = false;
        }
    }

    // Getter y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    // metodo imprimir
    public String imprimir() {
        return "El libro " + getTitulo() + "del autor " + getAutor() + "esta " + getDisponible();
    }
}
