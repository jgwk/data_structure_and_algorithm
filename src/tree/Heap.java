package tree;

public class Heap {
	static int[] heap = new int[16];
	static int size = 0;
	
	static void insert(int data) {
		size++;
		
		int index = size;
		while (true) {
			if (index == 1) break;
			if (data < heap[index/2]) break;
			
			heap[index] = heap[index/2];
			index = index/2;
		}
		
		heap[index] = data;
	}
	
	static int delete() {
		
		int item = heap[1];
		heap[1] = heap[size];
		heap[size] = 0;
		
		int index = 1;
		while(true) {
			if (index >= size/2) break;
			
			int child = index*2;
			if (heap[index] > heap[child] && heap[index] > heap[child+1]) {
				break;
			}
			else {
				int temp = heap[index];
				
				heap[index] = heap[child] > heap[child+1] ? heap[child] : heap[child+1];
				index = heap[child] > heap[child+1] ? child : child+1;
				
				heap[index] = temp;
			}
		}
		
		size--;
		return item;
	}
	
	static void print() {
		for (int i=1; i<=size; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		insert(3);
		insert(1);
		insert(2);
		insert(5);
		insert(9);
		insert(7);
		
		print();
		
		delete();
		print();
	}
}


