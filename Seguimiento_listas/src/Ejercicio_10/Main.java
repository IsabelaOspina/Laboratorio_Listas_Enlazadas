package Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista1 = new ListaEnlazada<>();
        lista1.agregarPrimero(1);
        lista1.agregarPrimero(2);
        lista1.agregarPrimero(3);

        ListaEnlazada<Integer> lista2 = new ListaEnlazada<>();
        lista2.agregarPrimero(4);
        lista2.agregarPrimero(5);
        lista2.agregarPrimero(6);


        ListaEnlazada<Integer> concatenada = ListaEnlazada.concatenar(lista1, lista2);
        concatenada.mostrar();



    }
}
