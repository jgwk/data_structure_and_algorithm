package etc;

import java.util.Arrays;
import java.util.Stack;

public class Find_Span {
	public static void main(String[] args) {
		new Find_Span().find(1,3,5,7,9,2,1,3,5,7);
		new Find_Span().find2(1,3,5,7,9,2,1,3,5,7);
	}
	
	/**
	 * 인덱스 0 : 스팬 0
	 * 인덱스 > 1 : 이전 값보다 클때까지 스팬 측정
	 */
	public void find(int... arr) {
		int[] spans = new int[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			int span = 0;
			
			for (int j=i-1; j>=0; j--) {
				if (arr[i] <= arr[j]) break;
				span++;
			}
			spans[i] = span;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(spans));
	}
	
	/**
	 * 가정1: 반복문을 돌면서 최대값의 위치를 배열에 저장하여 논다면 => X
	 * 가정2: 스택에 최대값을 넣어주면
	 */
	public void find2(int... arr) {
		int[] spans = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		
		int span = 0;
		for (int i=0; i<arr.length; i++) {
			while (!stack.isEmpty() && arr[i] > arr[stack.peek()])
				stack.pop();
			
			if(stack.isEmpty())
				span = -1;
			else
				span = stack.peek();
			
			spans[i] = i - span - 1;
			stack.push(i);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(spans));
	}
}
