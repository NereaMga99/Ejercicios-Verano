package org.grupo.alegal.GestionEmpleados;

public class Empleado {
    // Atributos
    String nombre;
    double salario;
    int idEmpleado;
    double salarioTocho;

    // Constructor con parámetros.
    public Empleado(String nombre, double salario, int idEmpleado) {
        this.nombre = nombre;
        this.salario = salario;
        this.idEmpleado = idEmpleado;
    }

    // Getter y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    // metodo para comprobarSalario
    public double comprobarSalario() {
        if (salario > 2000){
            salarioTocho = salario * 1.10;
        }
        return salarioTocho;
    }

    // Metodo imprimir
    public String imprimir() {
        return "El nombre de empleado es: " + getNombre() + ", su salario es: " + getSalario() +
                ", si tiene mas de 2000 de base al incrementar el 0.10 es: " + comprobarSalario() + " y su idEmpleado es: " + getIdEmpleado();
    }
}
