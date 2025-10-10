package Ejercicio_13;

public class Main {
    public static void main(String[] args) {
        List lista = new List();
        lista.agregarFinal(9);
        lista.agregarFinal(4);
        lista.agregarFinal(6);
        lista.agregarFinal(8);
        lista.agregarFinal(4);
        lista.agregarFinal(5);
        lista.agregarFinal(4);

        int x = 5;
        System.out.println("Máxima distancia para clave " + x + ": " + lista.maximaDistancia(x));
    }
}
