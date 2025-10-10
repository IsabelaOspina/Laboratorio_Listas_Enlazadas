package Ejercicio_9;

public class NodoCircular<E> {
    private E dato;
    private NodoCircular<E> proximo;

    public NodoCircular(E dato) {
        this.dato = dato;
        this.proximo = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoCircular<E> getProximo() {
        return proximo;
    }

    public void setProximo(NodoCircular<E> proximo) {
        this.proximo = proximo;
    }
}
