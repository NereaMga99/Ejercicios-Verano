package org.grupo.alegal.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora(10,5);
        System.out.println("El resulado de la suma es " + c.sum());
        System.out.println("El resulado de la resta es " + c.rest());
        System.out.println("El resulado del modulo es " + c.modulo());
        System.out.println("El resulado del doble es " + c.doble());
        System.out.println("El resulado del triple es " + c.triple());
        System.out.println("El resulado del cuadrado es " + c.cuadrado());
        System.out.println("El resulado del cubo es " + c.cubo());
    }
}
