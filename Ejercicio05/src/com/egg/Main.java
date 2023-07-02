package com.egg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad a ingresar: ");
        double cantidadIngreso = scanner.nextDouble();
        cuenta.ingresar(cantidadIngreso);
        cuenta.consultarSaldo();

        System.out.print("Ingrese la cantidad a retirar: ");
        int cantidadRetiro = scanner.nextInt();
        cuenta.retirar(cantidadRetiro);
        cuenta.consultarSaldo();

        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos(); // Mostrar datos del usuario al final
    }
}