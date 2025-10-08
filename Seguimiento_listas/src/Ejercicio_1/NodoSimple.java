package Ejercicio_1;

public class NodoSimple<E> {
    private E dato;
    private NodoSimple<E> proximo;

    public NodoSimple(E dato) {
        this.dato = dato;
        this.proximo = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoSimple<E> getProximo() {
        return proximo;
    }

    public void setProximo(NodoSimple<E> proximo) {
        this.proximo = proximo;
    }
}
