package org.grupo.alegal.ControlTareas;

public class Main {
    public static void main(String[] args) {
        Tarea[] tareas = new Tarea[]{
                new Tarea("Tarea 1", Boolean.FALSE),
                new Tarea("Tarea 2", Boolean.TRUE)
        };

        tareas[0].marcarComoCompletada();  // Marcamos como verdadera manualmente.

        for (int i = 0; i < tareas.length; i++) {
            System.out.println(tareas[i].imprimir());
        }
    }
}

