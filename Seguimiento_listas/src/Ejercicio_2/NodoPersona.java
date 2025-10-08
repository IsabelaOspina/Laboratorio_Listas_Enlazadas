package Ejercicio_2;

import Ejercicio_1.NodoSimple;

public class NodoPersona <E extends Persona>{
    private E dato;
    private NodoPersona<E> proximo;

    public NodoPersona(E dato) {
        this.dato = dato;
        this.proximo = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoPersona<E> getProximo() {
        return proximo;
    }

    public void setProximo(NodoPersona<E> proximo) {
        this.proximo = proximo;
    }

}
