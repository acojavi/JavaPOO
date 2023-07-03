package Main;

import Entidades.Operacion;
import Servicios.OperacionService;

public class Main {
    public static void main(String[] args) {
        OperacionService opServ = new OperacionService();
        Operacion op = opServ.crearOperacion();
        System.out.println(op.getNumero1() + " + " + op.getNumero2() + " = "+opServ.sumar(op));
        System.out.println(op.getNumero1() + " - " + op.getNumero2() + " = "+opServ.restar(op));
        System.out.println(op.getNumero1() + " * " + op.getNumero2() + " = "+ opServ.multiplicar(op));
        System.out.println(op.getNumero1() + " / " + op.getNumero2() + " = "+ opServ.dividir(op));

    }
}
