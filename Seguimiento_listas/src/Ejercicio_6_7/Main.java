package Ejercicio_6_7;

public class Main {
    public static void main(String[] args) {
        ListaDoble<Integer> lista = new ListaDoble<>();
        lista.agregarPrimero(1);
        lista.agregarPrimero(2);
        lista.agregarPrimero(3);
        lista.agregarPrimero(4);
        lista.agregarPrimero(5);

        lista.imprimirHaciaAtras();

        //implementacion  ejercicio 7
        for(Integer dato:lista){
            System.out.println(dato);
        }

    }
}
