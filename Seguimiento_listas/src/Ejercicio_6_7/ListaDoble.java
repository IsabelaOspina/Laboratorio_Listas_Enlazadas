package Ejercicio_6_7;

import Ejercicio_5.NodoGenerico;

public class ListaDoble<E> {
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
        if(primero == null){
            primero = nuevo;
            ultimo=nuevo;
            nuevo.setProximo(nuevo);
            nuevo.setAnterior(nuevo);

        }else{
            nuevo.setProximo(primero);
            nuevo.setAnterior(ultimo);
            primero.setAnterior(nuevo);
            ultimo.setProximo(nuevo);
            primero=nuevo;
        }
        this.tam++;
    }

    //metodo ejercicio 6
    public void imprimirHaciaAtras(){
        NodoDoble<E> actual=ultimo;
        do {
            System.out.print(actual.getDato() + " ");
            actual = actual.getAnterior();
        }while(actual!=ultimo);
        System.out.println();
    }

}
