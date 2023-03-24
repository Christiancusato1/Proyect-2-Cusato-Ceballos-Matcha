
package Proyecto2;

public class NodoPila {
    private Object elemento;
    private NodoPila siguiente;
    
    NodoPila(Object x)
{
    elemento = x;
    siguiente = null;
}

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
     
}
