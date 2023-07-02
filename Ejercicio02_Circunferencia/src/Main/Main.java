package Main;

import Entidades.Circunferencia;
import Servicios.CircunferenciaService;

public class Main {
    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.crearCircunferencia();
        //Circunferencia c2 = cs.crearCircunferencia();

        cs.calcularArea(c1);
        cs.calularPerimetro(c1);

    }
}
