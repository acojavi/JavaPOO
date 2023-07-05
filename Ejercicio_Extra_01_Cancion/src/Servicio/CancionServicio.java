package Servicio;

import Entidad.Cancion;

import java.util.Scanner;

public class CancionServicio {
    Scanner teclado = new Scanner(System.in);

    public Cancion crearCancion(){
        Cancion c1 = new Cancion();
        System.out.println("Ingrese el título de la canción: ");
        c1.setTitulo(teclado.nextLine());
        System.out.println("Ingrese el autor de la canción: ");
        c1.setAutor(teclado.nextLine());
        return c1;
    }
}
