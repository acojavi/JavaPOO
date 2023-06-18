package com.egg;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        operacion.crearOperacion();

        System.out.println("Suma de los dos numeros: "+ operacion.sumar());
        System.out.println("Su resta: "+ operacion.restar());
        System.out.println("Su multiplicacion: "+ operacion.multiplicar());
        System.out.println("Su division: "+ operacion.dividir());



    }
}
