package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Persona persona1= new Persona("isa", "1234");
        Persona persona2= new Persona("juan", "12345");
        Persona persona3= new Persona("juan", "222222");

        ListaSimplePersona<Persona> lista1= new ListaSimplePersona<>();
        lista1.agregarPrimero(persona3);
        lista1.agregarPrimero(persona2);
        lista1.agregarPrimero(persona1);


        lista1.obtenerCedulasPares();
    }
}
