package Ejercicio_5;

public class NodoGenerico<E> {
    private E dato;
    private NodoGenerico<E> proximo;

    public NodoGenerico(E dato) {
        this.dato = dato;
        this.proximo = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoGenerico<E> getProximo() {
        return proximo;
    }

    public void setProximo(NodoGenerico<E> proximo) {
        this.proximo = proximo;
    }
}
