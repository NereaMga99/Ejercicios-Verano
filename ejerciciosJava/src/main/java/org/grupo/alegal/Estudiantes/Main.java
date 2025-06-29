package org.grupo.alegal.Estudiantes;

public class Main {
    public static void main(String[] args) {
            Estudiante[] estudiantes = new Estudiante[] {
            new Estudiante("Alejandro" , 90, 6.99),
            new Estudiante("Ainhoa" , 14, 9)
        };

        for (Estudiante j : estudiantes) {
            System.out.println(j.calificacion());

        }
    }
}
