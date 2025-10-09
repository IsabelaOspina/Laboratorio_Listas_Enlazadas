package Ejercicio_3;

import Ejercicio_2.NodoPersona;

public class Lista {
    private Nodo primero;
    int tam;

    public Lista(){
        this.tam=0;
        this.primero=null;
    }
    public void agregarPrimero(int dato) {
        Nodo nuevo = new Nodo(dato);
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
        Nodo actual=primero;
        String mensaje="{ ";
        do{
            mensaje+=actual.getDato() + " ";
            actual=actual.getProximo();
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);
    }
    public boolean eliminar(int dato) {
        if (primero == null) {
            return false;
        }
        if (primero.getDato() == dato) {
            primero = primero.getProximo();
            return true;
        }
        Nodo actual = primero;
        while (actual.getProximo() != null && actual.getProximo().getDato() != dato) {
            actual = actual.getProximo();
        }
        if (actual.getProximo() == null) {
            return false;
        }
        actual.setProximo(actual.getProximo().getProximo());
        return true;
    }

     //metodo ejercicio 3
    public void eliminarPares(){
        Nodo actual=primero;
        while(actual !=null){
            if(actual.getDato() % 2 == 0){
                eliminar(actual.getDato());
            }
            actual=actual.getProximo();
        }
    }
}
