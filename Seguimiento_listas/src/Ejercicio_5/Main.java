package Ejercicio_5;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Integer> lista = new ListaGenerica<>();
        lista.agregarPrimero(1);
        lista.agregarPrimero(2);
        lista.agregarPrimero(2);
        lista.agregarPrimero(2);
        lista.agregarPrimero(5);
        lista.cantidadRepetido(2);

    }
}
