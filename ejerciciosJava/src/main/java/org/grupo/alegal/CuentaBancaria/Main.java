package org.grupo.alegal.CuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1234, "Nerea", 1000.00);
        System.out.println("Introduce valor a retirar");
        double valor = new Scanner(System.in).nextDouble();
        cuenta.retirar(valor);
        cuenta.depositar(1.00);
        cuenta.retirar(600.00); // Dará error.
    }
}
