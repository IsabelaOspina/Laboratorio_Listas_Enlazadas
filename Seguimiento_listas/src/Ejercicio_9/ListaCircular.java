package Ejercicio_9;

public class ListaCircular<E> {
    private NodoCircular<E>  primero;
    private NodoCircular<E>  ultimo;
    private int tam;

    public ListaCircular() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }
    public void mostrar() {
        NodoCircular<E> actual=primero;
        do{
            System.out.println(actual.getDato());
            actual=actual.getProximo();
        }while(actual !=primero);
    }

    //metodos ejercicio 9
    public void agregarPrimero(E dato) {
        NodoCircular<E> nuevo = new NodoCircular<>(dato);
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
            ultimo.setProximo(nuevo);
        }else{
            nuevo.setProximo(primero);
            primero=nuevo;
            ultimo.setProximo(primero);
        }
        tam++;
    }
    public boolean buscar(E dato){
        if (primero == null) {
            System.out.println("La lista está vacía.");
            return false;
        }
        NodoCircular<E> actual = primero;
        do {
            if (actual.getDato().equals(dato)) {
                System.out.println("Elemento encontrado: " + dato);
                return true;
            }
            actual = actual.getProximo();
        } while (actual != primero);

        System.out.println("Elemento no encontrado: " + dato);
        return false;


    }
}
