package stack;

public class Boot {
	public static void main(String[] args) {
		Stack s = new ArrayStack();
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
