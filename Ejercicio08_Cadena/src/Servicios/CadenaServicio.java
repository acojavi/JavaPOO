package Servicios;

import Entidades.Cadena;

import java.util.Locale;
import java.util.Scanner;

public class CadenaServicio {

    public Cadena crearCadena(){
        return new Cadena();
    }

    // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    //frase ingresada.

    public void mostrarVocales(Cadena cadena){
        int contVocales = 0;
        String frase = cadena.getFrase().toLowerCase();
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contVocales++;
            }
        }
        System.out.println("La frase tiene: "+ contVocales + " vocales.");
    }

    // Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase(Cadena cadena){
        String texto = cadena.getFrase();
        StringBuilder builder = new StringBuilder(texto);
        String fraseInvertida = builder.reverse().toString();
        System.out.println("La frase invertida es: "+ fraseInvertida);
    }

    // Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    // Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(String letra, Cadena cadena){
        char c = letra.charAt(0);
        String frase = cadena.getFrase().toLowerCase();
        int contLetra = 0;
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == c ){
                contLetra++;
            }
        }
        System.out.println("el caracter '"+ c + "' se repite: "+contLetra+" veces");
    }

    // Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    //compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(String frase, Cadena cadena){
        int longitud = cadena.getLongitud();
        int nuevaLongitud = frase.length();
        if (longitud > nuevaLongitud){
            System.out.println("La nueva frase es más corta.");
        } else if (longitud < nuevaLongitud){
            System.out.println("La nueva frase es más larga.");
        } else {
            System.out.println("Las dos frases tienen la misma longitud.");
        }
    }

    // Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(String frase, Cadena cadena){
        String fraseUnida = cadena.getFrase() + " " + frase;
        System.out.println(fraseUnida);

    }
    // Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
    //la frase resultante.
    public void reemplazarLetra(String letra, String nuevoCaracter, Cadena cadena){
        String frase = cadena.getFrase();
        String fraseReemplazada = frase.replace(letra, nuevoCaracter);
        System.out.println("Frase resultante (frase1) : " + fraseReemplazada);
    }

    // Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.

    public boolean contieneLetra(String letra, Cadena cadena){
        String frase = cadena.getFrase().toLowerCase();
        return frase.contains(letra.toLowerCase());
    }




}
