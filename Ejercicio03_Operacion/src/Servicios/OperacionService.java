package Servicios;

import Entidades.Operacion;

import java.util.Scanner;

public class OperacionService {

    public Operacion crearOperacion(){
        Scanner teclado = new Scanner(System.in);
        Operacion numeros1y2 = new Operacion(); // instanciamos un objeto que tome dos numneros

        System.out.println("Ingrese el primer número (numero1): ");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número (numero2): ");
        int numero2 = teclado.nextInt();
        numeros1y2.setNumero1(numero1); // Asignamos el valor de numero1 al objeto numeros1y2
        numeros1y2.setNumero2(numero2); // Asignamos el valor de numero2 al objeto numeros1y2
        return numeros1y2;
    }

    public int sumar(Operacion numeros1y2){
        return numeros1y2.getNumero1()+numeros1y2.getNumero2();
    }

    public int restar(Operacion numeros1y2){
        return numeros1y2.getNumero1()-numeros1y2.getNumero2();
    }



    public int multiplicar(Operacion numeros1y2){
        if (numeros1y2.getNumero2() == 0) {
            System.out.println("Error. No se puede multiplicar por 0");
            return 0;
        }
        return numeros1y2.getNumero1()*numeros1y2.getNumero2();

    }

    public int dividir(Operacion numeros1y2) {
        if (numeros1y2.getNumero2() == 0) {
            System.out.println("Error. No se puede dividir por 0");
            return 0;
        }
        return numeros1y2.getNumero1() / numeros1y2.getNumero2();
    }

}
