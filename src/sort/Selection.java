package sort;

public class Selection {
	public static void main(String[] args) {
		int[] array = { 69, 10, 30, 2, 16, 8, 61, 22 };

		new Selection().sort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

	void sort(int[] array) {
		for (int i=0; i<array.length; i++) {
			int minIndex = i;
			for (int j=i+1; j<array.length; j++) {
				minIndex = array[minIndex] < array[j] ? minIndex : j;
			}
			
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}
}
