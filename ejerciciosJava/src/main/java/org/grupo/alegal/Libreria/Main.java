package org.grupo.alegal.Libreria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public static Libro[] libros = new Libro[] {
                new Libro("Quijote", "Cervantes", false),
                new Libro("Donde los arboles cantan", "Laura Gallego", true)
        };

        public static Libro buscar(Libro libro) {
            Libro resultado = null;
            for (Libro l : libros) {
                if (l.setTitulo().equals(libro.getTitulo)) {
                    resultado = l;
                }
            }
            return resultado;
        }

        public static void main (String[] args) {
            System.out.println("Introduce titulo");
            String titulo = new Scanner(System.in).next();
            Libro l = buscar(new libro(titulo, ""));
        }
    }
}
