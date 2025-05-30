package queue;

public class QueueLink<E> implements Queue<E> {
	private Node<E> last;
	private Node<E> first;
	
	public QueueLink() {
		last = first = null;
	}
	public void enque(E x) {
		Node<E> newNode = new Node<E>(x);
		if (isEmpty()) 
			first = newNode;
		else 
			last.setNext(newNode);
		last = newNode;
	}
	
	public E dequeue() throws ExceptionIsEmpty{
		if (isEmpty())
			throw new ExceptionIsEmpty("Queue esta vacia...");
		E x = first.getData();
		first = first.getNext();
		if (first == null)
			last = null;
		return x;
	}
	public E back() throws ExceptionIsEmpty{
		if (isEmpty())
			throw new ExceptionIsEmpty("Queue esta vacia...");
		return last.getData();
	}
	public E front() throws ExceptionIsEmpty{
		if (isEmpty())
			throw new ExceptionIsEmpty("Queue esta vacia...");
		return first.getData();
	}
	public boolean isEmpty () {
		return last == null;
	}
	public String toString() {
		String str = "";
		for (Node<E> i = first; i != null; i = i.getNext())
			str += i + ", ";
		return str;
	}
}
