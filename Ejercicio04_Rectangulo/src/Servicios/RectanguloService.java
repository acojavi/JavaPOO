package Servicios;
import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloService {
    Scanner teclado = new Scanner(System.in);

    public Rectangulo crearRectangulo(){
        Rectangulo rect = new Rectangulo();
        System.out.println("Ingrese la base del rectángulo: ");
        rect.setBase(teclado.nextInt());
        System.out.println("Ingrese la altura del rectángulo: ");
        rect.setAltura(teclado.nextInt());
        return rect;
    }

    public void datosRectangulo(Rectangulo rect){
        System.out.println("Ingresaste base " + rect.getBase() + " y altura " + rect.getAltura() + " para tu rectángulo.");
    }

    public int calcularSuperficie(Rectangulo rect){
        return rect.getAltura()*rect.getBase();
    }

    public int calcularPerimetro(Rectangulo rect){
        return (rect.getAltura()+rect.getBase())*2;
    }

    public void dibujarRectangulo(Rectangulo rect){
        System.out.println("Dibujando rectángulo de base " + rect.getBase() + " y altura " + rect.getAltura()+":");
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if(i==0 || i==rect.getAltura()-1 || j== 0 || j==rect.getBase()-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }


}
