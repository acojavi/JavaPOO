package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {

    public Cafetera crearCafetera(){
        Scanner teclado = new Scanner(System.in);
        Cafetera caf = new Cafetera();
        System.out.println("Ingrese la capacidad maxima de la cafetera: ");
        caf.setCapacidadMaxima(teclado.nextInt());
<<<<<<< HEAD
        caf.setCantidadActual(0); // no hace falta porque se debería inicializar en 0 pero bueno
=======
        caf.setCantidadActual(0); // no hace falta porque se deberia inicializar en 0 pero bueno
>>>>>>> 092b39c886ab49af4efe5c8fea67962d56cce5da
        return caf;
    }

    public void llenarCafetera(Cafetera cafe){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }

    public int servirTaza(int taza, Cafetera caf){
        if(caf.getCantidadActual()>= taza) {
            caf.setCantidadActual(caf.getCantidadActual() - taza);
            return caf.getCantidadActual();
        } else {
            int cantidad = caf.getCantidadActual();
            caf.setCantidadActual(-1);
            return cantidad;
        }
    }

    public void vaciarCafetera(Cafetera caf){
        caf.setCantidadActual(0);
    }

    public void agregarCafe(int cafeextra,Cafetera caf){
        caf.setCantidadActual(caf.getCantidadActual()+cafeextra);
    }

    public void Menu(Cafetera caf){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la opción que desea: ");
        System.out.println("1. Llenar Cafetera");
        System.out.println("2. Servir Taza");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Agregar Café");
        System.out.println("5. Salir");

        int opc = teclado.nextInt();
        switch(opc){

            case 1:
                llenarCafetera(caf);
                System.out.println("Cafetera llena: " + caf.getCapacidadMaxima());
                Menu(caf);
                break;

            case 2:
                if(caf.getCantidadActual()>0){
                    System.out.println("Digite la cantidad que desea servir");

                    int cantidad = servirTaza(teclado.nextInt(), caf);
                    if(caf.getCantidadActual()<0)
                        System.out.println("No hay suficiente cafe, solamente se llenó una taza con: "+ cantidad);
                    else
                        System.out.println("Se sirvió la taza con éxito");
                } else {
                    System.out.println("La cafetera está vacía. Agregue más café");
                }
                Menu(caf);
                break;

            case 3:
                vaciarCafetera(caf);
                System.out.println("Se vació la cafetera con éxito");
                Menu(caf);
                break;

            case 4:
                System.out.println("Ingrese la cantidad de café que desea agregar: ");
                int agregar = teclado.nextInt();
                agregarCafe(agregar, caf);
                if(caf.getCantidadActual()>caf.getCapacidadMaxima()) {
                    System.out.println("Sobraron " + (caf.getCantidadActual() - caf.getCapacidadMaxima()) + ", la cafetera quedó llena");
                    llenarCafetera(caf);
                } else {
                    System.out.println("Se agregó " + agregar + " a la cafetera, quedó en total: " + caf.getCantidadActual());
                }
                Menu(caf);
                break;

            case 5:
                System.out.println("Un gusto, volvé cuando quieras más café");
                break;

            default:
                System.out.println("Opción incorrecta, volve a intentar");
                Menu(caf);
                break;
        }
    }
}
