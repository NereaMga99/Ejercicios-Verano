package org.grupo.alegal.Libreria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro[] libros = new Libro[] {
            new Libro("Quijote", "Cervantes", false),
            new Libro("Donde los arboles cantan", "Laura Gallego", true)
        };

        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i].imprimir());
        }

        libros[0].prestar();
        libros[0].devolver(); // Al devolver el libro deberia de estar en true de nuevo
        System.out.println(libros[0].imprimir()); // Lo comprobamos con el metodo imprimir especificando el libro

        libros[1].prestar(); // Deberia de pasar a false ya que se ha prestado el libro.
        System.out.println(libros[1].imprimir()); // Comprobamos su estado.
    }
}
