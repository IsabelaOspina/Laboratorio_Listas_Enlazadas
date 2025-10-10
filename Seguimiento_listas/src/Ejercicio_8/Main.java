package Ejercicio_8;

import Ejercicio_2.Persona;

public class Main {
    public static void main(String[] args) {
        ListaDPersona<PersonaD> lista=new ListaDPersona<>();
        PersonaD persona1= new PersonaD("isa", "1234");
        PersonaD persona2= new PersonaD("juan", "12345");
        PersonaD persona3= new PersonaD("juan", "222222");

        lista.agregarPrimero(persona1);
        lista.agregarPrimero(persona2);
        lista.agregarPrimero(persona3);

        lista.cedulaCantidadPar();

    }
}
