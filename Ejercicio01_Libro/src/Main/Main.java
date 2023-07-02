package Main;

import Entidades.Libro;
import Servicios.LibroService;

public class Main {
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        Libro libro1 = ls.crearLibro(); // creo mi libro y lo guardo en mi variable libro1
        System.out.println();
        ls.mostrarDatos(libro1); // mostramos datos del libro1 creado

        // Libro libro2 = ls.crearLibro();
        // System.out.println();
        // ls.mostrarDatos(libro2); // mostramos datos del libro2
    }
}
