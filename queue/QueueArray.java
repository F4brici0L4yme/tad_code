package queue;

public class QueueArray<E> implements Queue<E> {
    private static final int CAPACITY = 100;
    private E[] data;
    private int front;
    private int rear;
    private int size;

    public QueueArray() {
        data = (E[]) new Object[CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enque(E x) {
        if (size == CAPACITY)
            throw new RuntimeException("Queue overflow");
        rear = (rear + 1) % CAPACITY;
        data[rear] = x;
        size++;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Queue está vacía...");
        E x = data[front];
        front = (front + 1) % CAPACITY;
        size--;
        return x;
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Queue está vacía...");
        return data[rear];
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Queue está vacía...");
        return data[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(data[(front + i) % CAPACITY]).append(", ");
        }
        return sb.toString();
    }
}
