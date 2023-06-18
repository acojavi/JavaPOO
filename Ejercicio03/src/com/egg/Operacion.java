package com.egg;

import java.util.Scanner;

public class Operacion {


    private int numero1;
    private int numero2;


    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }


    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        this.numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        this.numero2 = sc.nextInt();
    }

    public int sumar() {
        return numero1 + numero2;
    }
    public double restar(){
        return numero1 - numero2;
    }

    public int multiplicar(){
        if (numero2 == 0) {
            System.out.println("No se puede multiplicar por 0");
            return 0;
        }
        return numero1 * numero2;
    }

    public int dividir(){
        if (numero2 == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        }
        return numero1 / numero2;
    }


}
