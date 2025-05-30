package queue;

public class TestQueueArray {
    public static void main(String[] args) {
        Queue<Integer> q = new QueueArray<>();

        try {
            q.enque(10);
            System.out.println("q: " + q + " P: " + q.front() + " U: " + q.back());
            q.enque(6);
            System.out.println("q: " + q + " P: " + q.front() + " U: " + q.back());
            q.enque(7);
            System.out.println("q: " + q + " P: " + q.front() + " U: " + q.back());
            q.enque(9);
            System.out.println("q: " + q + " P: " + q.front() + " U: " + q.back());
            q.enque(2);
            System.out.println("q: " + q + " P: " + q.front() + " U: " + q.back());

            while (!q.isEmpty())
                System.out.println("Elim: " + q.dequeue() + " P: " + (!q.isEmpty() ? q.front() : "null") + " U: " + (!q.isEmpty() ? q.back() : "null"));

        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}
