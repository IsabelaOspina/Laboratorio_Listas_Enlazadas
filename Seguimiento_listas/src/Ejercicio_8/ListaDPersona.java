package Ejercicio_8;

import Ejercicio_6_7.NodoDoble;

public class ListaDPersona <E extends PersonaD>{
    private NodoDPersona<E> primero;
    private NodoDPersona<E> ultimo;
    private int tam;

    public ListaDPersona() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }
    public void agregarPrimero(E dato){
        NodoDPersona<E> nuevo = new NodoDPersona<>(dato);
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

    public void mostrar() {
        NodoDPersona<E> actual = ultimo;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getAnterior();
        }
        System.out.println();
    }

    //metodo ejercicio 8
    public void cedulaCantidadPar(){
        NodoDPersona<E> actual = primero;
        while (actual != null) {
            if(actual.getDato().getCedula().length() % 2 == 0){
                System.out.println(actual.getDato());
            }
            actual = actual.getProximo();
        }
    }

}
