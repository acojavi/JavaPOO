package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafi){
        cafi.setCantidadActual(cafi.getCapacidadMaxima()));
    }


    /*
    public Cafetera crearCafetera(){
        Cafetera Caf1 = new Cafetera();
        System.out.println("Ingrese la capacidad maxima de la cafetera:");
        Caf1.setCapacidadMaxima(leer.nextInt());
        Caf1.setCantidadActual(0);

        return Caf1;
    }
    */
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad maxima de la cafetera:");
        int capMax= leer.nextInt();
        int cantAct= 0;
        return new Cafetera(capMax,cantAct);
    }



}
