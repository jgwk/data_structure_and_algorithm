package queue;

public class ArrayQueue implements Queue {
	public static void main(String[] args) {
		Queue q = new ArrayQueue();
		
		q.enQueue('a');
		q.enQueue('b');
		q.enQueue('c');
		q.enQueue('d');
		q.enQueue('e');
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.delete();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
	
	private int front;
	private int rear;
	private char[] items;
	
	public ArrayQueue() {
		items = new char[128];
		front = -1;
		rear = -1;
	}
	
	@Override
	public boolean isEmpty() {
		return front == rear;
	}

	@Override
	public void enQueue(char item) {
		items[++rear] = item;
	}

	@Override
	public char deQueue() {
		return items[++front];
	}

	@Override
	public void delete() {
		++front;
	}

	@Override
	public char peek() {
		return items[front+1];
	}

}
