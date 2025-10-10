package Ejercicio_4;

import Ejercicio_3.Lista;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista=new ListaEnlazada();
        lista.agregarPrimero(1);
        lista.agregarPrimero(2);
        lista.agregarPrimero(3);
        lista.agregarPrimero(4);
        lista.agregarPrimero(5);

        ListaEnlazada impares= lista.obtenerImpares();
        impares.mostrar();
    }
}
