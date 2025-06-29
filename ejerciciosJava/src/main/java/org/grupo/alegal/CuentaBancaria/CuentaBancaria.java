package org.grupo.alegal.CuentaBancaria;

public class CuentaBancaria {
    //Atributos
    private int cuentaBancaria;
    private String titular;
    private double saldo;

    public CuentaBancaria(int cuentaBancaria, String titular, double saldo) {
        this.cuentaBancaria = cuentaBancaria;
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodo retirar
    public void retirar(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("no hay saldo");
        } else {
            this.saldo -= cantidad;
        }
    }

    public void depositar(double cantidad) {
            this.saldo += cantidad;
        }
    }
