package org.grupo.alegal.Calculadora;

public class Calculadora {

    // atributos.
    private int numero1;
    private int numero2;

    // constructor
    public Calculadora(int numero1, int numero2) {
        this.numero1= numero1;
        this.numero2= numero2;
    }

    // setter.
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    // metodo suma
    public int sum() {
        int resultadoSuma = numero1 + numero2;
        return resultadoSuma;
    }

    // metodo resta
    public int rest() {
        int resultadoResta = numero1 - numero2;
        return resultadoResta;
    }

    // metodo modulo (porcentaje)
    public int modulo() {
        int resultadoModulo = numero1 % numero2;
        return resultadoModulo;
    }

    // metodo doble
    public int doble() {
        int resultadoDoble = numero1 * 2;
        return resultadoDoble;
    }

    // metodo triple
    public int triple() {
        int resultadoTriple = numero1 * 3;
        return resultadoTriple;
    }

    // metodo cuadrado
    public int cuadrado() {
        int resultadoCuadrado = numero1 * numero1;
        return resultadoCuadrado;
    }

    // metodo cubo
    public int cubo() {
        int resultadoCubo = numero1 * numero1 * numero1;
        return resultadoCubo;
    }
}
