package Main;
import Entidades.Cafetera;
import Servicios.CafeteraServicios;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Nespresso (soy una cafetera común)");
        CafeteraServicios cafServ = new CafeteraServicios();
        Cafetera cafetera = cafServ.crearCafetera();
        cafServ.Menu(cafetera);
    }
}
