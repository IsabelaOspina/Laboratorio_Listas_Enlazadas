package Ejercicio_1;

public class ListaSimple<E> {
    private NodoSimple<E> primero;
    private int tam;

    public ListaSimple() {
        primero = null;
        tam = 0;

    }
    public void agregarPrimero(E dato) {
        NodoSimple<E> nuevo = new NodoSimple<>(dato);
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
        NodoSimple<E> actual=primero;
        String mensaje="{ ";
        do{
            mensaje+=actual.getDato() + " ";
            actual=actual.getProximo();
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);
    }

    //metodo ejercicio 1
    public void mostrarPosicionImpar(){
        NodoSimple<E> actual=primero;
        String mensaje="{ ";
        int i=0;
        do{
            if(i%2!=0){
                mensaje+=actual.getDato() + " ";
            }
            actual=actual.getProximo();
            i++;
        }while(actual!=null);
        mensaje+=" }";
        System.out.println(mensaje);


    }



}
