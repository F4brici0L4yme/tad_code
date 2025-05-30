package stack;

public class StackArray<E> implements Stack<E> {
	private E[] array;
	private int tope;
	
	public StackArray(int n) {
		array = (E[])new Object[n];
		tope = -1;
	}
	public void push(E x) {
		if (tope < array.length-1)
			array[++tope] = x;
	}
	public E pop() throws ExceptionIsEmpty{
		if (isEmpty())
			throw new ExceptionIsEmpty("Stack esta vacio...");
		E x = array[tope --];
		return x;
	}
	public E top() throws ExceptionIsEmpty{
		if (isEmpty())
			throw new ExceptionIsEmpty("Stack esta vacio...");
		return array[tope];
	}
	
	public boolean isEmpty () {
		return tope == -1;
	}
	
	public String toString() {
		String str = "";
		for(int i = tope; i >= 0 ; i--)
			str += array[i] + ", ";
		return str;
	}
}
