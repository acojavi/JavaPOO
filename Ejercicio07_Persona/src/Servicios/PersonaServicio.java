package Servicios;

import Entidades.Persona;

import java.util.Scanner;

public class PersonaServicio {



    public Persona crearPersona(){
        Scanner teclado = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(teclado.nextLine());
        System.out.println("Ingrese la edad de la persona: ");
        persona.setEdad(teclado.nextInt());
        System.out.println("Ingrese el peso de la persona: ");
        persona.setPeso(teclado.nextDouble());
        System.out.println("Ingrese la altura de la persona: ");
        persona.setAltura(teclado.nextDouble());
        char sexo;
        do {
            System.out.println("Digite el sexo ('M', 'H', 'O'): ");
            sexo = Character.toUpperCase(teclado.next().charAt(0));
            if (validarSexo(sexo)) {
                System.out.println("El sexo que digitaste no es válido, vuelve a intentar");
            }
        } while (validarSexo(sexo));
        persona.setSexo(sexo);
        return persona;
    }

    public int calcularIMC(Persona persona){

        persona.setImc(persona.getPeso()/(Math.pow(persona.getAltura(), 2)));
        if(persona.getImc()<20)
            return -1;
        else if(persona.getImc()>=20 && persona.getImc()<=25)
            return 0;
        else
            return 1;
    }

    public boolean validarSexo(char sexo) {
        sexo = Character.toUpperCase(sexo);  // Convertir a mayúsculas para hacer la validación más flexible
        return sexo != 'H' && sexo != 'M' && sexo != 'O';
    }

    public boolean esMayorDeEdad(Persona persona){
        persona.setMayor(persona.getEdad() >= 18);
        return persona.isMayor();
    }

    public void validarPesoEdad(Persona persona,int numPer)
    {
        switch(calcularIMC(persona)){
            case -1:
                System.out.println("La persona " + numPer +": " + persona.getNombre()+ " está por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("La persona " + numPer +": " + persona.getNombre()+ " está en su peso ideal");
                break;
            case 1:
                System.out.println("La persona " + numPer +": " + persona.getNombre() + " está en sobrepeso");
                break;
        } if (esMayorDeEdad(persona)) {
        System.out.println("La persona " + numPer +": " + persona.getNombre()+ " es mayor de edad");
        } else {
        System.out.println("La persona " + numPer +": " + persona.getNombre() + " es menor de edad");
        }
    }




}
