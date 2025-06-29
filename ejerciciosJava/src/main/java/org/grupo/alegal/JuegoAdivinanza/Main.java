package org.grupo.alegal.JuegoAdivinanza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JuegoAdivinanza homer = new JuegoAdivinanza();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero aleatorio");
            int numero = scanner.nextInt();
        if (homer.ComprobarNumero(numero)) {
            System.out.println("buen trabajo");
            flag = false;
        } else {
            System.out.println("Intentalo de nuevo");
        }
        } while (flag);
    }
}
