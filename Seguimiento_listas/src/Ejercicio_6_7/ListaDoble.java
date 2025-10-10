package Ejercicio_6_7;

import Ejercicio_5.NodoGenerico;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaDoble<E> implements Iterable<E> {
    private NodoDoble<E> primero;
    private NodoDoble<E> ultimo;
    private int tam;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }
    public void agregarPrimero(E dato){
        NodoDoble<E> nuevo = new NodoDoble<>(dato);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
        this.tam++;

    }

    //metodo ejercicio 6
    public void imprimirHaciaAtras(){
        NodoDoble<E> actual = ultimo;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getAnterior();
        }
        System.out.println();

    }

    //metodo ejercicio 7
    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            private NodoDoble<E> actual=primero;

            @Override
            public boolean hasNext(){
                return actual!=null;
            }
            @Override
            public E next(){
                if (actual == null) {
                    throw new NoSuchElementException();
                }
                E dato=actual.getDato();
                actual=actual.getProximo();
                return dato;
            }
        };

    }

}
