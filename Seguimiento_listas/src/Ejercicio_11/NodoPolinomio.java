package Ejercicio_11;

public class NodoPolinomio {
    private double coeficiente;
    private int exponente;
    private NodoPolinomio proximo;

    public NodoPolinomio(double coeficiente, int exponente){
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.proximo = null;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public NodoPolinomio getProximo() {
        return proximo;
    }

    public void setProximo(NodoPolinomio proximo) {
        this.proximo = proximo;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
}
