package Servicios;
import Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    Scanner teclado = new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos puntos = new Puntos();
        System.out.println("Ingrese la coordenada X1: ");
        puntos.setX1(teclado.nextFloat());
        System.out.println("Ingrese la coordenada Y1: ");
        puntos.setY1(teclado.nextFloat());
        System.out.println("Ingrese la coordenada X2: ");
        puntos.setX2(teclado.nextFloat());
        System.out.println("Ingrese la coordenada Y2: ");
        puntos.setY2(teclado.nextFloat());
        return puntos;
    }

    public void calcularDistancia(Puntos puntos){
        System.out.println("La distancia entre los dos puntos es: " +  Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(), 2) + Math.pow(puntos.getY2() - puntos.getY1(), 2)));
    }
}
