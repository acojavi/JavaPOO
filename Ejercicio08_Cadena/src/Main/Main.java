package Main;


import Entidades.Cadena;
import Servicios.CadenaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");


        CadenaServicio cadenaServicio = new CadenaServicio();
        Cadena frase1 = cadenaServicio.crearCadena();

        System.out.println("Ingrese una frase: ");
        String fraseRandom = leer.nextLine();
        frase1.setFrase(fraseRandom);
        frase1.setLongitud(fraseRandom.length());

        System.out.println("La frase ingresada es: "+ frase1.getFrase());
        System.out.println("La longitud de la frase es: " + frase1.getLongitud());

        cadenaServicio.mostrarVocales(frase1);
        cadenaServicio.invertirFrase(frase1);

        System.out.print("Ingrese un carácter: ");
        String letra = leer.nextLine();
        cadenaServicio.vecesRepetido(letra, frase1);

        System.out.print("Ingrese una nueva frase: ");
        String frase2 = leer.nextLine();
        cadenaServicio.compararLongitud(frase2, frase1);

        System.out.print("Las frases unidas quedan así: ");
        // String fraseUnir = lector.nextLine();
        cadenaServicio.unirFrases(frase2, frase1);

        System.out.print("Ingrese un carácter para reemplazar (frase1): ");
        String letraReemplazar = leer.nextLine();
        System.out.print("Ingrese el nuevo carácter: ");
        String nuevoCaracter = leer.nextLine();
        cadenaServicio.reemplazarLetra(letraReemplazar, nuevoCaracter, frase1);

        System.out.print("Ingrese una letra a buscar (frase1): ");
        String letraBuscar = leer.nextLine();
        boolean contieneLetra = cadenaServicio.contieneLetra(letraBuscar,frase1);
        System.out.println("La frase contiene la letra '" + letraBuscar + "': " + contieneLetra);

        System.out.println("Chau loco suerte");

    }
}