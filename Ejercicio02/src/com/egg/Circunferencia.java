package com.egg;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    //Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio){
        this.radio = radio;
    }

    // Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    //objeto.
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        double nuevoRadio;
        nuevoRadio = sc.nextDouble();
        this.radio = nuevoRadio;
    }

    // Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    public double area(){
        return Math.PI * radio * radio;
    }

    //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
