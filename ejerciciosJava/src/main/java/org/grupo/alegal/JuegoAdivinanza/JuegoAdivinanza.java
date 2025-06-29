package org.grupo.alegal.JuegoAdivinanza;

import java.util.Random;

public class JuegoAdivinanza {
    // Atributo.
    private int numero;

    // Constructor.
    public JuegoAdivinanza() {
        this.numero = new Random().nextInt(100);
    }

    public boolean ComprobarNumero(int num) {
        return this.numero == num;
    }
}
