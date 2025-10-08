package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple();
        lista.agregarPrimero(1);
        lista.agregarPrimero(2);
        lista.agregarPrimero(3);
        lista.agregarPrimero(4);
        lista.agregarPrimero(5);
        lista.mostrar();

        lista.mostrarPosicionImpar();
    }
}
