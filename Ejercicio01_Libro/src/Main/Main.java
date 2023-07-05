package Main;

import Entidades.Libro;
import Servicios.LibroService;

public class Main {
    public static void main(String[] args) {
        LibroService libroService = new LibroService();
        Libro libro = libroService.crearLibro(); // creo mi libro y lo guardo en mi variable libro
        System.out.println();
        libroService.mostrarDatos(libro); // mostramos datos del libro1 creado

        // Libro libro2 = ls.crearLibro();
        // System.out.println();
        // ls.mostrarDatos(libro2); // mostramos datos del libro2
    }
}
