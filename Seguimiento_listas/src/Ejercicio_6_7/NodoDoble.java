package Ejercicio_6_7;

public class NodoDoble<E> {
    private E dato;
    private NodoDoble<E> proximo;
    private NodoDoble<E> anterior;

    public NodoDoble(E dato) {
        this.dato = dato;
        this.proximo = null;
        this.anterior = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoDoble<E> getProximo() {
        return proximo;
    }

    public void setProximo(NodoDoble<E> proximo) {
        this.proximo = proximo;
    }

    public NodoDoble<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<E> anterior) {
        this.anterior = anterior;
    }
}
