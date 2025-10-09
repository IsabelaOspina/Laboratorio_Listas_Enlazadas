package Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        Lista lista=new Lista();
        lista.agregarPrimero(1);
        lista.agregarPrimero(2);
        lista.agregarPrimero(3);
        lista.agregarPrimero(4);
        lista.agregarPrimero(5);

        lista.eliminarPares();
        lista.mostrar();

    }
}
