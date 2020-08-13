public class ArrayStack<E> implements Stack<E>{

    private E[] elems;
    private int top;//用于指向栈顶的元素

//Constructor
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity){
    elems = (E[]) new Object[capacity];
    top = 0;
    }

    public boolean isEmpty(){
        return top==0;
    }

    @SuppressWarnings("unchecked")
    public E push(E elem){

        if(top == elems.length){
            Object [] tmp = new Object[2*elems.length];
            for(int i =0;i<elems.length;i++){
                tmp[i]=elems[i];
            }
           
            elems = (E[]) tmp;
        }

        elems[top]= elem;
        top++;

        return elem;
    }

    public E pop(){
        E saved;
        top--;
        saved = elems[top];
        elems[top]=null;    
        return saved;

    }

    public E peek(){

        return elems[top-1];
    }

    public int size(){
        return top;
    }
}