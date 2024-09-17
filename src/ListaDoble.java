public class ListaDoble {
    private NodoDoble inicio,fin;

    public ListaDoble() {
        inicio=fin=null;
    }

    //Metodo para saber si la lista esta vacia
    public boolean isEmpty(){
        return inicio==null;
    }

    //Metodo agregar nodos al inicio
    public void agregarAlInicio(int dato){
        if (!isEmpty()){
            inicio = new NodoDoble(dato,inicio,null);
            inicio.getSiguiente().setAnterior(inicio);
        }else {
            inicio=fin=new NodoDoble(dato);
        }
    }

    //Metodo agregar nodos al final
    public void agregarAlFinal(int dato){
        if (!isEmpty()){
            fin = new NodoDoble(dato,null,fin);
            fin.getAnterior().setSiguiente(fin);
        }else {
            inicio=fin=new NodoDoble(dato);
        }

    }

    //Metodo para remover un elemento al inicio de la lista
    public void eliminarInicio(){
        if (inicio==fin){
            inicio=fin=null;
        }else {
            inicio=inicio.getSiguiente();
            inicio.setAnterior(null);
        }
    }

    //Metodo para remover un elemento al fin de la lista
    public void eliminarFin(){
        if (inicio==fin){
            inicio=fin=null;
        }else {
            fin=fin.getAnterior();
            fin.setSiguiente(null);
        }
    }

    // Metodo para remover nodo
    public void eliminar(int dato){
        if (!isEmpty()){
            NodoDoble recorrer=inicio;
            NodoDoble Anterior=null;
            while (recorrer!=null){
                if (recorrer.getDato()==dato){
                    if (recorrer==inicio){
                        eliminarInicio();
                    }else if(recorrer==fin){
                        eliminarFin();
                    }else {
                        Anterior.setSiguiente(recorrer.getSiguiente());
                        recorrer.getSiguiente().setAnterior(Anterior);
                    }
                }
                Anterior=recorrer;
                recorrer=recorrer.getSiguiente();
            }
        }

    }

    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioAFin(){
        if (!isEmpty()){
            NodoDoble recorrer=inicio;
            System.out.print("[ ");
            while (recorrer!=null){
                System.out.print(recorrer.getDato()+" ");
                recorrer=recorrer.getSiguiente();
            }
            System.out.print("]");
        }
        System.out.println();
    }

    //Metodo para mostrar la lista de fin a inicio
    public void mostrarListaFinAinicio(){
        if (!isEmpty()){
            NodoDoble recorrer=fin;
            System.out.print("[");
            while (recorrer!=null){
                if (recorrer.getSiguiente()!=null){
                    System.out.print(",");
                }
                System.out.print(recorrer.getDato());
                recorrer=recorrer.getAnterior();
            }
            System.out.print("]");
        }
        System.out.println();
    }







}
