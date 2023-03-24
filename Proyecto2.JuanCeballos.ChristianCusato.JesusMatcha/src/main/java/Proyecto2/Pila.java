
package Proyecto2;

public class Pila {
    private NodoPila top;
    private NodoPila base;
    private int size;
    
    //Para construir una pila

    public Pila() {
        this.top = this.base=null;
        this.size = 0;
    }
    //Para saber si una pila esta vacia
    
    public boolean isEmpty(){
        return top == null;
    }
    //Para vaciar una pila
    public void empty(){
        this.top=this.base=null;
        this.size=0;
    }
    
    
    //para apilar en una pila
    public void push(int dato){
        NodoPila nodo= new NodoPila(dato);
        if(this.isEmpty()){
            top=base=nodo;
            
        }else{
            nodo.setSiguiente(top);
            top=nodo;
        }
        size++;
    }
    //Para desapilar en una pila
    
    public void pop(){
        if(this.isEmpty()){
            System.out.println("La pila esta vacia");
        }else{
            top=top.getSiguiente();
            size--;
        }
        
    }
    //desapila y retorna el nodo para que no se pierda
    
    public NodoPila pop2(){
        NodoPila aux=null;
        if(this.isEmpty()){
            return aux;
            
        }else if(size==1){
            aux=top;
            top=top.getSiguiente();
            size--;
            aux.setSiguiente(null);
         
            
        }
            return aux;
    }
    


  
        
    
        

    /**
     * @return the top
     */
    public NodoPila getTop() {
        return top;
    }

    public void setTop(NodoPila top) {
        this.top = top;
    }

    public NodoPila getBase() {
        return base;
    }

    public void setBase(NodoPila base) {
        this.base = base;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
