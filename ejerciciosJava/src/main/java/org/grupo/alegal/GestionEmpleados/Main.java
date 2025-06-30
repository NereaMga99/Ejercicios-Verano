package org.grupo.alegal.GestionEmpleados;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado ("Ainhoa", 2500, 1234);
        Empleado i = new Empleado("Alex", 900, 5678);
        System.out.println(e.imprimir());
        System.out.println(i.imprimir());
    }



}

