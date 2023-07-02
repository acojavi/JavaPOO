package Servicios;
import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {
    private Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese radio de la circunferencia");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);
    }

    public void calcularArea(Circunferencia c){
        System.out.println("El área de la circunferencia es: ");
        double area = Math.PI * Math.pow(c.getRadio(), 2);
        System.out.println(area);
    }

    public void calularPerimetro(Circunferencia c){
        System.out.println("El perimetro de la circunferencia es: ");
        double perimetro = 2 * Math.PI * c.getRadio();
        System.out.println(perimetro);
    }
}
