package com.egg;

import java.util.Scanner;

public class Libro {

    Scanner sc = new Scanner(System.in); // scanner para que ingresemos datos

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;


    // constructor vacio de Libro
    public Libro() {
    }

    // constructor del Libro con atributos
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // metodo para cargar los datos a las variables del libro con el scanner sc
    public void cargaLibro() {
        System.out.println("Por favor ingrese el ISBN: ");
        isbn = sc.nextLine();
        System.out.println("Por favor ingrese el titulo: ");
        titulo = sc.nextLine();
        System.out.println("Por favor ingrese el autor: ");
        autor = sc.nextLine();
        System.out.println("Por favor ingrese el numero de páginas: ");
        numPaginas = sc.nextInt();
    }

    // metodo para imprimir los datos del libro
    public void imprimeLibro() {
        System.out.println("El ISBN del libro es: " + isbn);
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El numero de páginas del libro es: " + numPaginas);
    }
}

