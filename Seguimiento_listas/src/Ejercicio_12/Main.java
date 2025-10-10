package Ejercicio_12;

public class Main {
    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();

        lista.agregarPrimero(10);
        lista.agregarPrimero(12);
        lista.agregarPrimero(14);
        lista.agregarPrimero(16);
        lista.agregarPrimero(18);

        lista.mostrar();


        double media = lista.calcularMedia();
        double desviacion = lista.calcularDesviacion();

        System.out.println("Media:" + media);
        System.out.println("Desviación estándar:" + desviacion);
    }


}
