package com.egg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        int altura = sc.nextInt();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("Superficie del rectángulo: " + rectangulo.calcularSuperficie());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        System.out.println("Dibujo del rectángulo:");
        rectangulo.dibujarRectangulo();
    }
}
