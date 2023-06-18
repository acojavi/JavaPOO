package com.egg;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();


        System.out.println("Suma de los dos numeros: " + operacion.sumar());
        System.out.println("Su resta: " + operacion.restar());


        //En lugar de usar estructuras if-else separadas, se utiliza el operador ternario dentro de los métodos System.out.println() para determinar el mensaje a mostrar en función del resultado de cada operación.
        int multiplicacion = operacion.multiplicar();
        System.out.println((multiplicacion == 0) ? "Multiplicacion da 0" : "Multiplicacion: " + multiplicacion);

//        int multiplicacion = operacion.multiplicar();
//        if (multiplicacion == 0) {
//            System.out.println("Multiplicacion da 0");
//        } else {
//            System.out.println("Multiplicacion: " + multiplicacion);
//        }

        int division = operacion.dividir();
        if (division == 0) {
            System.out.println("La división da 0");
        } else {
            System.out.println("Division: " + division);
        }
    }
}
