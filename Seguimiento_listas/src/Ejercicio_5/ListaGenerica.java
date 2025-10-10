package Ejercicio_5;

import Ejercicio_4.NodoS;

public class ListaGenerica<E> {
    private NodoGenerico<E> primero;
    private int tam;

    public ListaGenerica() {
        this.primero = null;
        this.tam = 0;
    }
    public void agregarPrimero(E dato) {
        NodoGenerico<E> nuevo = new NodoGenerico<>(dato);
        if (primero == null) {
            primero = nuevo;
            tam++;
        }else {
            nuevo.setProximo(primero);
            primero = nuevo;
            tam++;
        }
    }
    public void mostrar() {
        NodoGenerico<E> actual = primero;
        String mensaje="{ ";
        do{
            mensaje+=actual.getDato() + " ";
            actual=actual.getProximo();
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);
    }

    //metodo ejercicio 5
    public void cantidadRepetido(E dato){
        NodoGenerico<E> nuevo = new NodoGenerico<>(dato);
        NodoGenerico<E> actual = primero;
        int contador=0;
        while(actual != null){
            if(actual.getDato().equals(dato)){
                contador++;
            }
            actual=actual.getProximo();
        }
        System.out.println(dato + "se repite " + contador  + " veces ");
    }


}
