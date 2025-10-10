package Ejercicio_12;

public class ListaNumeros {
    private NodoLista primero;
    private int tam;

    public ListaNumeros() {
        this.tam = 0;
        this.primero = null;
    }
    public void agregarPrimero(int dato) {
        NodoLista nuevo = new NodoLista(dato);
        if (primero == null) {
            primero = nuevo;
            tam++;
        }else {
            nuevo.setProximo(primero);
            primero = nuevo;
            tam++;
        }
    }
    public void mostrar() {
        NodoLista actual=primero;
        String mensaje="{ ";
        do{
            mensaje+=actual.getDato() + " ";
            actual=actual.getProximo();
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);
    }
    public double calcularMedia(){
        int suma=0;
        NodoLista actual=primero;
        while(actual!=null){
            suma+=actual.getDato();
            actual=actual.getProximo();
        }


        return (double) suma /tam;
    }
    public double calcularDesviacion(){
        if (tam < 2){
            System.out.println("la desviacion es: 0" );
        }

        double media = calcularMedia();
        double sumaCuadrados = 0;
        NodoLista actual = primero;

        while (actual != null) {
            sumaCuadrados += Math.pow(actual.getDato()- media, 2);
            actual = actual.getProximo();
        }
        return Math.sqrt(sumaCuadrados / (tam - 1));

    }
}
