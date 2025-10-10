package Ejercicio_13;

public class List {
    private NodoList inicio;

    public List() {
        inicio = null;
    }

    public void agregarFinal(int x) {
        if (inicio == null) {
            inicio = new NodoList(x, null);
        } else {
            NodoList actual = inicio;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(new NodoList(x, null));
        }
    }

    public int maximaDistancia(int x) {
        return maximaDistanciaRec(inicio, x, 0, -1, 0);
    }

    private int maximaDistanciaRec(NodoList nodo, int x, int pos, int primeraPos, int maxDist) {
        if (nodo == null) return maxDist;

        if (nodo.getDato() == x) {
            if (primeraPos == -1) {
                primeraPos = pos;
            } else {
                int distancia = (pos - primeraPos) - 2;
                if (distancia > maxDist)
                    maxDist = distancia;
            }
        }
        return maximaDistanciaRec(nodo.getSig(), x, pos + 1, primeraPos, maxDist);
    }

}



