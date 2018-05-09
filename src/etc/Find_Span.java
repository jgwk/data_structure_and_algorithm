package etc;

import java.util.Arrays;
import java.util.Stack;

public class Find_Span {
	public static void main(String[] args) {
		new Find_Span().find(1,3,5,7,9,2,1,3,5,7);
		new Find_Span().find2(1,3,5,7,9,2,1,3,5,7);
	}
	
	/**
	 * �ε��� 0 : ���� 0
	 * �ε��� > 1 : ���� ������ Ŭ������ ���� ����
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
	 * ����1: �ݺ����� ���鼭 �ִ밪�� ��ġ�� �迭�� �����Ͽ� ��ٸ� => X
	 * ����2: ���ÿ� �ִ밪�� �־��ָ�
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
