package Ejercicio_10;

public class NodoEnlazado<E> {
    private NodoEnlazado<E> proximo;
    private E dato;

    public NodoEnlazado(E dato) {
        this.dato = dato;
        this.proximo = null;
    }

    public NodoEnlazado<E> getProximo() {
        return proximo;
    }

    public void setProximo(NodoEnlazado<E> proximo) {
        this.proximo = proximo;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
}
