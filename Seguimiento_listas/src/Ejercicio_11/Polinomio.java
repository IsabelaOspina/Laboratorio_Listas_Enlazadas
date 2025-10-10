package Ejercicio_11;

public class Polinomio {
    private NodoPolinomio primero;
    private int tam;

    public Polinomio() {
        this.tam = 0;
        this.primero = null;
    }

    public void agregarUltimo(double coeficiente, int exponente) {
        NodoPolinomio nuevo = new NodoPolinomio(coeficiente, exponente);
        if (primero == null) {
            primero = nuevo; // ✅ CORRECTO
        } else {
            NodoPolinomio actual = primero;
            while (actual.getProximo() != null) {
                actual = actual.getProximo();
            }
            actual.setProximo(nuevo);
        }
        tam++;
    }

    public void mostrar() {
        NodoPolinomio actual = primero;
        while (actual != null) {
            if (actual.getExponente() == 0) {
                System.out.print(actual.getCoeficiente());
            } else if (actual.getExponente() == 1) {
                System.out.print(actual.getCoeficiente() + "x");
            } else {
                System.out.print(actual.getCoeficiente() + "x^" + actual.getExponente());
            }

            if (actual.getProximo() != null) {
                System.out.print(" + ");
            }

            actual = actual.getProximo();
        }
        System.out.println();
    }

    public double evaluar(double x) {
        double resultado = 0;
        NodoPolinomio actual = primero;
        while (actual != null) {
            resultado += actual.getCoeficiente() * Math.pow(x, actual.getExponente());
            actual = actual.getProximo();
        }
        return resultado;
    }
}
