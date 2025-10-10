package Ejercicio_13;

public class NodoList {
    private int dato;
    private NodoList sig;

    public NodoList(int x, NodoList n) {
        dato = x;
        sig = n;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoList getSig() {
        return sig;
    }

    public void setSig(NodoList sig) {
        this.sig = sig;
    }
}
