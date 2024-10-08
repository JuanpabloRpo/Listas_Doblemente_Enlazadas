public class NodoDoble {
    private int dato;
    private NodoDoble siguiente,anterior;

    // Constructor primer nodo
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente=null;
        this.anterior=null;
    }

    // Constructor para cuando hay nodos
    public NodoDoble(int dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
