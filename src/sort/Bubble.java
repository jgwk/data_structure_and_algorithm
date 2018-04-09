package sort;

public class Bubble {
	public static void main(String[] args) {
		int[] array = { 69, 10, 30, 2, 16, 8, 61, 22 };

		new Bubble().sort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
	void sort(int[] array) {
		for (int i=array.length; i>0; i--) {
			for (int j=0; j<i-1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
