public class LinkedStack_02<E> implements Stack<E>{

    private Elem<E> top;
    
    public LinkedStack_02(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    
    public E push (E newVal){
        top = new Elem<E>*(newVal, top);
    
        return newVal;
    
    }
    
    public Object pop(){
        Object val = top.value;
        top = top.next;
        return val;
    }
    
    public Object peek(){
        return top.value;  
    }
    
    public int size(){
        return 0;// Not implemented.
    }
    }