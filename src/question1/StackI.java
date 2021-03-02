package question1;

public interface StackI<E> {
    void push(E e);
    E pop();
    boolean isEmpty();
}
