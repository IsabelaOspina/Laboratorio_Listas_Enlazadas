package Ejercicio_3;

public class Nodo {
    int dato;
    Nodo proximo;

    public Nodo(int dato) {
        this.dato = dato;
        this.proximo=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
