package Ejercicio_8;

public class NodoDPersona<E> {
    private E dato;
    private NodoDPersona<E> proximo;
    private NodoDPersona<E> anterior;

    public NodoDPersona(E dato) {
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

    public NodoDPersona<E> getProximo() {
        return proximo;
    }

    public void setProximo(NodoDPersona<E> proximo) {
        this.proximo = proximo;
    }

    public NodoDPersona<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDPersona<E> anterior) {
        this.anterior = anterior;
    }
}
