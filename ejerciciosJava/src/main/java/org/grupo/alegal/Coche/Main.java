package org.grupo.alegal.Coche;

public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("blanco" , "c3 aircross" , 2022);

        System.out.println(c.getColor());
        System.out.println (c.getModelo());
        System.out.println (c.getAnyo());
    }
}
