package Ejercicio_10;

import Ejercicio_1.NodoSimple;
import Ejercicio_9.NodoCircular;

public class ListaEnlazada<E> {
    private NodoEnlazado<E> primero;
    private int tam;

    public ListaEnlazada(){
        this.tam = 0;
        this.primero = null;
    }

    public NodoEnlazado<E> getPrimero() {
        return primero;
    }

    public void setPrimero(NodoEnlazado<E> primero) {
        this.primero = primero;
    }

    public void agregarPrimero(E dato) {
        NodoEnlazado<E> nuevo = new NodoEnlazado<>(dato);
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
        NodoEnlazado<E> actual=primero;
        String mensaje="{ ";
        do{
            mensaje+=actual.getDato() + " ";
            actual=actual.getProximo();
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);
    }

    public static<E> ListaEnlazada<E> concatenar(ListaEnlazada<E> lista1, ListaEnlazada<E> lista2){
        ListaEnlazada<E> resultado= new ListaEnlazada<>();

        NodoEnlazado<E> actual1 =lista1.getPrimero();
        while(actual1!=null){
           resultado.agregarPrimero(actual1.getDato());
           actual1=actual1.getProximo();
        }
        NodoEnlazado<E> actual2 =lista2.getPrimero();
        while(actual2!=null){
            resultado.agregarPrimero(actual2.getDato());
            actual2=actual2.getProximo();
        }
        return resultado;

    }
}
