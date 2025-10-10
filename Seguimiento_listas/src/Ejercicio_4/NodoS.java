package Ejercicio_4;


public class NodoS {
    private int dato;
    private NodoS proximo;

    public NodoS(int dato) {
        this.dato = dato;
        this.proximo = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoS getProximo() {
        return proximo;
    }

    public void setProximo(NodoS proximo) {
        this.proximo = proximo;
    }
}
