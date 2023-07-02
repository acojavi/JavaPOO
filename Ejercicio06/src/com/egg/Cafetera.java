package com.egg;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 0;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(capacidadMaxima, cantidadActual);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("Llenaste la taza.");
        } else {
            int cantidadServida = cantidadActual;
            cantidadActual = 0;
            System.out.println("No se pudo llenar la taza, pero alcanzó para: " + cantidadServida + " unidades de café.");
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }
}
