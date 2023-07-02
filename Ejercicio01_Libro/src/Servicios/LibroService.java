package Servicios;
import Entidades.Libro;


import java.util.Scanner;


public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro(){
        System.out.println("Ingrese ISBN del libro:");
        int isbn = leer.nextInt();
        System.out.println("Ingrese número de paginas:");
        int numPaginas = leer.nextInt();
        System.out.println("Ingrese título:");
        String titulo = leer.next();
        System.out.println("Ingrese autor:");
        String autor = leer.next();
        return new Libro(isbn, titulo, autor, numPaginas);
    }

    public void mostrarDatos(Libro datoLibro){
        System.out.println("El ISBN del libro es: " + datoLibro.getIsbn());
        System.out.println("El título del libro es: " + datoLibro.getTitulo());
        System.out.println("El autor del libro es: " + datoLibro.getAutor());
        System.out.println("El número de páginas del libro son: " + datoLibro.getNumPaginas());
    }
}
