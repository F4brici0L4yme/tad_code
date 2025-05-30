package queue;

public class TestQueue {
	public static void main(String arg[]) {
		Queue<Integer> s = new QueueLink();
		try {
			
			
			s.enque(10);
			System.out.println("s: " + s +" P: " + s.front() + " U: " + s.back());
			s.enque(6);
			System.out.println("s: " + s +" P: " + s.front() + " U: " + s.back());
			s.enque(7);
			System.out.println("s: " + s +" P: " + s.front() + " U: " + s.back());
			s.enque(9);
			System.out.println("s: " + s +" P: " + s.front() + " U: " + s.back());
			s.enque(2);
			System.out.println("s: " + s +" P: " + s.front() + " U: " + s.back());
			while(!s.isEmpty())
				System.out.println("Elim: " + s.dequeue() +" P: " + s.front() + " U: " + s.back());
			
	
			
		}catch(ExceptionIsEmpty e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
