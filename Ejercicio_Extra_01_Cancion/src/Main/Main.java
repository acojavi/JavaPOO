package Main;

import Servicio.CancionServicio;

public class Main {
    public static void main(String[] args) {
        CancionServicio cancionServicio = new CancionServicio();
        System.out.println(cancionServicio.crearCancion().toString());

    }
}
