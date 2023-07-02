package nespresso;
import Entidades.Cafetera;
import Servicios.CafeteraServicios;
import java.util.Scanner;
public class Nespresso {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicios serv = new CafeteraServicios();

        Cafetera c1= serv.crearCafetera();
        serv.llenarCafetera(c1);




    }
}
