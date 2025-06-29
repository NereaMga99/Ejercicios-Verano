package org.grupo.alegal.ConversorTemperatura;

public class ConversorTemperatura {
    // metodo convertir Celsius a Fahrenheit.
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // metodo convertir Fahrenheit a Celsius.
    public static double FahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
