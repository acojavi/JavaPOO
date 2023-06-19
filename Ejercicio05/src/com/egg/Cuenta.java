package com.egg;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(long dni, int numeroCuenta) {
        this.dniCliente = dni;
        this.numeroCuenta = numeroCuenta;
    }

    // Métodos getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Método para crear un objeto Cuenta pidiendo los datos al usuario
    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el DNI del cliente: ");
        dniCliente = scanner.nextLong();

        System.out.print("Ingrese el saldo actual: ");
        saldoActual = scanner.nextInt();
    }

    // Método ingresar
    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    // Método retirar
    public void retirar(double retiro) {
        if (retiro <= saldoActual) {
            saldoActual -= retiro;
        } else {
            saldoActual = 0;
        }
    }

    // Método extraccionRapida
    public void extraccionRapida() {
        double limite = saldoActual * 0.2;

        System.out.print("Extracción rápida (hasta " + limite + "): ");
        Scanner scanner = new Scanner(System.in);
        int retiro = scanner.nextInt();

        if (retiro <= limite) {
            saldoActual -= retiro;
        } else {
            System.out.println("La cantidad ingresada excede el límite de extracción rápida.");
        }
    }

    // Método consultarSaldo
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoActual);
    }

    // Método consultarDatos
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }
}