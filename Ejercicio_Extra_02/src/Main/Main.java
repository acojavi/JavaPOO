package Main;
import Entidades.Puntos;
import Servicios.PuntosServicio;


public class Main {
    public static void main(String[] args) {
        PuntosServicio puntosServicio = new PuntosServicio();
        Puntos puntos = puntosServicio.crearPuntos();
        puntosServicio.calcularDistancia(puntos);
    }
}
