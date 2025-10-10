package Ejercicio_9;

public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> lista  = new ListaCircular<>();
        lista.agregarPrimero(1);
        lista.agregarPrimero(2);
        lista.agregarPrimero(3);
        lista.agregarPrimero(4);
        lista.agregarPrimero(5);
        lista.mostrar();


        lista.buscar(3);
    }
}
