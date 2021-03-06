package stack;

public class ArrayStack implements Stack {
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
	
	private int top;
	private char[] items;
	
	
	public ArrayStack() {
		top = -1;
		items = new char[128];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public void push(char item) {
		items[++top] = item;
	}

	@Override
	public char pop() {
		return items[top--];
	}

	@Override
	public void delete() {
		top--;
	}

	@Override
	public char peek() {
		return items[top];
	}
	
}
