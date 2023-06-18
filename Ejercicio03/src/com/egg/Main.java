package com.egg;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();


        System.out.println("Suma de los dos numeros: " + operacion.sumar());
        System.out.println("Su resta: " + operacion.restar());


        int multiplicacion = operacion.multiplicar();
        if (multiplicacion == 0) {
            System.out.println("Multiplicacion da 0");
        } else {
            System.out.println("Multiplicacion: " + multiplicacion);
        }

        int division = operacion.dividir();
        if (division == 0) {
            System.out.println("La división da 0");
        } else {
            System.out.println("Division: " + division);
        }
    }
}
