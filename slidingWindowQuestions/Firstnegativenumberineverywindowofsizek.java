package slidingWindowQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Firstnegativenumberineverywindowofsizek {
//	static int[] firstNegativeNumber(int[] arr , int k) {
//		int n = arr.length;
//		int[] firstNegativeNumbers = new int[n-k+1];
//		int idx = 0;
//		
//		for (int i = 0; i < n-k+1; i++) {
//			int firstNegativeNum = 0;
//			for (int j = i; j < i+k; j++) {
//				if(arr[j] < 0){
//					firstNegativeNum = arr[j];
//					break;
//				}
//			}
//			firstNegativeNumbers[idx++] = firstNegativeNum;
//		}
//		return firstNegativeNumbers;
//	}

	static int[] firstNegativeNumber(int[] arr, int k) {
		int n = arr.length;
		int[] ans = new int[n - k + 1];
		int idx = 0;

		Queue<Integer> queue = new LinkedList<>();
		//PriorityQueue<Integer> queue = new PriorityQueue<>();
		int windowStart = 0;
		int windowEnd = 0;
		for (windowEnd = 0; windowEnd < n; windowEnd++) {
			if (arr[windowEnd] < 0) {
				queue.add(arr[windowEnd]);
			}
			if (windowEnd - windowStart + 1 == k) {
				if (queue.isEmpty()) {
					ans[idx++] = 0;
				} else {
					int num = queue.peek();
					ans[idx++] = num;
					if (num == arr[windowStart]) {
						queue.remove();
					}
				}
				windowStart++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { -5, 1, 2, -6, 9 };
		int[] ans = firstNegativeNumber(arr, 2);
		System.out.println(Arrays.toString(ans));
	}
}
