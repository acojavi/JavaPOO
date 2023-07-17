package Main;

import Entidades.Cuenta;
import Servicios.CuentaServicio;

public class Main {
    public static void main(String[] args) {
        CuentaServicio cuentaServ = new CuentaServicio();
        System.out.println("Bienvenido a nuestro banco, a continuación crearemos una cuenta");
        Cuenta cuenta = cuentaServ.crearCuenta();
        System.out.println("Cuenta creada con éxito");
        cuentaServ.Menu(cuenta);
    }
}
