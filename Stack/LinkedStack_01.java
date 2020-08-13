public class LinkedStack_01 implements Stack{

private Elem top;

public LinkedStack_01(){
    top = null;
}
public boolean isEmpty(){
    return top == null;
}

public Object push (Object newVal){
    top = new Elem(newVal, top);

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