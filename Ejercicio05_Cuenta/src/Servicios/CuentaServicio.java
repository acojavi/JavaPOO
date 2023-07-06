package Servicios;

import Entidades.Cuenta;

import java.util.Scanner;

public class CuentaServicio {
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    public Cuenta crearCuenta(){
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese su numero de cuenta: ");
        cuenta.setNumeroCuenta(teclado.nextInt());
        System.out.println("Ingrese su DNI: ");
        cuenta.setDniCliente(teclado.nextLong());
        //cuenta.setSaldoActual(0);
        //cuenta.setInteres(0);
        return cuenta;
    }

    public void ingresoDinero(double ingreso, Cuenta cuenta){
        cuenta.setSaldoActual(ingreso+cuenta.getSaldoActual());
        System.out.println("Depósito exitoso, saldo actual: " +cuenta.getSaldoActual());
    }

    public void retiroDinero(double retiro, Cuenta cuenta) {
        if (retiro <= cuenta.getSaldoActual()) {
            cuenta.setSaldoActual((cuenta.getSaldoActual() - retiro));
            System.out.println("Retiro exitoso, saldo actual: " + cuenta.getSaldoActual());
        } else {
            cuenta.setSaldoActual(0);
            System.out.println("No se puede realizar el retiro porque su saldo es insuficiente. Saldo actual: 0");
        }
    }

    public boolean extraccionRapida(Cuenta cuenta) {
        if (cuenta.getSaldoActual() > 0) {
            double retiro = cuenta.getSaldoActual() * 0.2;
            double total = cuenta.getSaldoActual() - retiro;

            if (total < 0) {
                System.out.println("No se puede retirar el 20%, saldo insuficiente");
                return false;
            } else {
                cuenta.setSaldoActual((long) total);
                System.out.println("Retiro rápido (20%) exitoso, saldo actual: " + cuenta.getSaldoActual());
                return true;
            }
        } else {
            System.out.println("No se puede realizar el retiro rápido porque su saldo es cero.");
            return false;
        }
    }

    public double ConsultarSaldo(Cuenta cuenta){
        return cuenta.getSaldoActual();
    }

    public void consultarDatos(Cuenta cuenta){
        System.out.println("El número de cuenta es: "+ cuenta.getNumeroCuenta());
        System.out.println("El DNI es: " + cuenta.getDniCliente());
        System.out.println("El saldo actual es: " + cuenta.getSaldoActual());
    }


    public void Menu(Cuenta cuenta) {
        System.out.println("Ingrese la opción que desea");
        System.out.println("1. Deposito");
        System.out.println("2. Retiro");
        System.out.println("3. Extracción rápida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos");
        System.out.println("6. Salir");
        int opc = teclado2.nextInt();
        switch(opc)
        {
            case 1:
                System.out.println("Ingrese el monto depositar: ");
                double deposito = teclado2.nextDouble();
                ingresoDinero(deposito,cuenta);
                Menu(cuenta);
                break;
            case 2:
                System.out.println("Ingrese el monto a retirar: ");
                double retiro = teclado2.nextDouble();
                retiroDinero(retiro, cuenta);
                Menu(cuenta);
                break;
            case 3:
                extraccionRapida(cuenta);
                Menu(cuenta);
                break;
            case 4:
                System.out.println("Su saldo actual es: " + ConsultarSaldo(cuenta));
                Menu(cuenta);
                break;
            case 5:
                consultarDatos(cuenta);
                Menu(cuenta);
                break;
            case 6:
                System.out.println("Gracias, saludos a la familia!");
                break;
            default:
                System.out.println("Opción inválida, vuelva a intentar");
                Menu(cuenta);
                break;
        }

    }

}
