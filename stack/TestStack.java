package stack;

public class TestStack {
	public static void main(String arg[]) {
		Stack<Integer> s = new StackLink();
		try {
			
			s.pop();
			
			s.push(10);
			System.out.println("s: " + s +" Top: " + s.top());
			s.push(6);
			System.out.println("s: " + s +" Top: " + s.top());
			s.push(7);
			System.out.println("s: " + s +" Top: " + s.top());
			s.push(9);
			System.out.println("s: " + s +" Top: " + s.top());
			s.push(2);
			System.out.println("s: " + s +" Top: " + s.top());
			while(!s.isEmpty())
				System.out.println("Elim: " + s.pop() +" s: " + s);
			
	
			
		}catch(ExceptionIsEmpty e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
