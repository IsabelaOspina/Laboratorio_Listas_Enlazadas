package Ejercicio_2;

import Ejercicio_1.NodoSimple;

public class ListaSimplePersona <E extends Persona> {
    private NodoPersona<E> primero;
    private int tam;

    public ListaSimplePersona() {
        primero = null;
        tam = 0;

    }
    public void agregarPrimero(E dato) {
        NodoPersona<E> nuevo = new NodoPersona<>(dato);
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
        NodoPersona<E> actual=primero;
        String mensaje="{ ";
        do{
            mensaje+=actual.getDato() + " ";
            actual=actual.getProximo();
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);
    }

    //metodo ejercico 2
    public void obtenerCedulasPares(){
        String mensaje = "{ ";
        NodoPersona<E> actual = primero;

        while (actual != null) {
            String cedula = actual.getDato().getCedula();

            if (cedula.length() % 2 == 0) {
                mensaje += actual.getDato().toString() + ", ";
            }
            actual = actual.getProximo();
        }
        mensaje += "}";
        System.out.println(mensaje);
    }
}
