package com.egg;

public class Main {
        public static void main(String[] args) {
            Cafetera nespresso = new Cafetera(1000, 100); // cap maxima y cantidad actual

            nespresso.servirTaza(200); // servimos una taza con x cantidad de unidades de capacidad de café
            System.out.println("Cantidad actual de café: " + nespresso.getCantidadActual());

            nespresso.llenarCafetera(); // Se llena la cafetera con lo que indicamos en capacidadMaxima
            System.out.println("Llenamos la cafetera con " + nespresso.getCantidadActual() +" unidades de café");
            nespresso.servirTaza(700); // Se intenta servir una taza de x cantidad
            System.out.println("Cantidad actual de café: " + nespresso.getCantidadActual());

            nespresso.vaciarCafetera(); // vaciamos la cafetera, tendria que dar 0
            System.out.println("Vaciamos la cafetera, ahora la cafetera tiene: " + nespresso.getCantidadActual());

            nespresso.agregarCafe(400); // le agreamos x de café a la cafetera
            System.out.println("Agregamos café, ahora la cafetera tiene: " + nespresso.getCantidadActual());
        }
}


