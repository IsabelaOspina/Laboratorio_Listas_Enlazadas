package Ejercicio_12;

public class NodoLista {
    private int dato;
    private NodoLista proximo;

    public NodoLista(int dato) {
        this.dato = dato;
        this.proximo = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getProximo() {
        return proximo;
    }

    public void setProximo(NodoLista proximo) {
        this.proximo = proximo;
    }
}
