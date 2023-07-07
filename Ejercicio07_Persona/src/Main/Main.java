package Main;
import Entidades.Persona;
import Servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {

        PersonaServicio personaServ = new PersonaServicio();
        Persona persona1 = personaServ.crearPersona();
        Persona persona2 = personaServ.crearPersona();
        Persona persona3 = personaServ.crearPersona();
        Persona persona4 = personaServ.crearPersona();

        personaServ.validarPesoEdad(persona1, 1);
        personaServ.validarPesoEdad(persona2, 2);
        personaServ.validarPesoEdad(persona3, 3);
        personaServ.validarPesoEdad(persona4, 4);

        int cantBajoPeso = 0,cantPesoIdeal = 0,cantSobrePeso=0,mayorEdad=0,menorEdad=0;

        if (personaServ.calcularIMC(persona1)== -1){
            cantBajoPeso ++;
        } else if (personaServ.calcularIMC(persona1)== 0){
            cantPesoIdeal++;
        } else {
            cantSobrePeso ++;
        }
        if (personaServ.calcularIMC(persona2)== -1){
            cantBajoPeso ++;
        } else if (personaServ.calcularIMC(persona2)== 0){
            cantPesoIdeal++;
        } else {
            cantSobrePeso ++;
        }
        if (personaServ.calcularIMC(persona3)== -1) {
            cantBajoPeso ++;
        } else if (personaServ.calcularIMC(persona3)== 0){
            cantPesoIdeal++;
        } else {
            cantSobrePeso ++;
        }
        if (personaServ.calcularIMC(persona4)== -1){
            cantBajoPeso ++;
        } else if (personaServ.calcularIMC(persona4)== 0){
            cantPesoIdeal++;
        } else {
            cantSobrePeso ++;
        }

        if(persona1.isMayor()){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }
        if(persona2.isMayor()){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }
        if(persona3.isMayor()){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }
        if(persona4.isMayor()){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }

        int porcentajeBajoPeso = cantBajoPeso * 25;
        int porcentajePesoIdeal = cantPesoIdeal * 25;
        int porcentajeSobrepeso = cantSobrePeso * 25;
        int porcentajeMayorEdad = mayorEdad * 25;
        int porcentajeMenorEdad = menorEdad * 25;

        System.out.println("Porcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
        System.out.println("Porcentaje de personas con peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayorEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenorEdad + "%");


    }
}
