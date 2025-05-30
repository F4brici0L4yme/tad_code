package stack;

public class StackLink<E> implements Stack<E> {
    private Node<E> tope;

    public StackLink() {
        tope = null;
    }

    public void push(E x) {
        tope = new Node<>(x, tope);
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Stack está vacío...");
        E x = tope.getData();
        tope = tope.getNext();
        return x;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Stack está vacío...");
        return tope.getData();
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<E> i = tope; i != null; i = i.getNext())
            sb.append(i.getData()).append(", ");
        return sb.toString();
    }
}
