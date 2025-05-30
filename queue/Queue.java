package queue;

public interface Queue<E> {
	void enque(E x);
	E dequeue() throws ExceptionIsEmpty;
	E back() throws ExceptionIsEmpty;
	E front() throws ExceptionIsEmpty;
	boolean isEmpty ();
}
