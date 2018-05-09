package backtracking;

import java.util.Arrays;

public class N_Bit_All_String {
	public static void main(String[] args) {
		nbas(4);
	}
	
	static void nbas(int n) {
		int[] arr = new int[n];
		
		nbas(arr, n);
	}
	
	static void nbas(int[] arr, int n) {
		if (n == 0) {
			System.out.println(Arrays.toString(arr).replaceAll("[\\[\\]\\, ]", ""));
			return;
		} else {
			arr[n - 1] = 0;
			nbas(arr, n - 1);
			arr[n - 1] = 1;
			nbas(arr, n - 1);
		}
	}
}
