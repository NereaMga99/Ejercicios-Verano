package org.grupo.alegal.ConversorTemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura = scanner.nextDouble();
        char mander = scanner.next().charAt(0);

        switch (mander) {
            case 'C':
                System.out.println(ConversorTemperatura.FahrenheitACelsius(temperatura));
                break;
            case 'F':
                System.out.println(ConversorTemperatura.celsiusAFahrenheit(temperatura));
                break;
        }
    }
}
