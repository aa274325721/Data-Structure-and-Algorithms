public interface Stack<E>{

    public abstract E push(E elem);//入栈

    public abstract E pop();//出栈

    public abstract E peek();

    public abstract boolean isEmpty();

    public int size();
    
    public String toString();

}