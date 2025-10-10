package Ejercicio_4;

public class ListaEnlazada {
    private NodoS primero;
    int tam;

    public ListaEnlazada() {
        this.tam=0;
        this.primero=null;
    }
    public void agregarPrimero(int dato) {
        NodoS nuevo = new NodoS(dato);
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
        NodoS actual=primero;
        String mensaje="{ ";
        do{
            mensaje+=actual.getDato() + " ";
            actual=actual.getProximo();
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);
    }

    //metodo ejercicio 4
    public ListaEnlazada obtenerImpares(){
        ListaEnlazada impares = new ListaEnlazada();
        NodoS actual=primero;
        while(actual!=null){
            if(actual.getDato() %2 != 0){
                impares.agregarPrimero(actual.getDato());
            }
            actual=actual.getProximo();
        }
        return impares;
    }
}
