package Main;
import Entidades.Rectangulo;
import Servicios.RectanguloService;

public class Main {
    public static void main(String[] args) {
        RectanguloService recServ = new RectanguloService();
        Rectangulo rectangulo1 = recServ.crearRectangulo();
        recServ.datosRectangulo(rectangulo1);
        System.out.println("Su superficie es: " + recServ.calcularSuperficie(rectangulo1));
        System.out.println("Su perimetro es: " + recServ.calcularPerimetro(rectangulo1));
        recServ.dibujarRectangulo(rectangulo1);
    }
}
