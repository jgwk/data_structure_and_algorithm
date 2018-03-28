package queue;

public class Boot {
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
}
