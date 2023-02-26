package slidingWindowQuestions;
//Given an array of integers a, and an integer k, find the maximum for each and every contiguous subarray of size k.
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class MaximumOfAllSubarraysOfSizeK {

//	static int[] maximumOfAllSubarray(int[] nums, int k) {
//		int[] ans = new int[nums.length - k +1];
//		int idx = 0;
//		for(int i = 0 ; i < nums.length-k+1 ; i++) {
//			int maxElem  = Integer.MIN_VALUE;
//			for(int j = i ; j < i+k ; j++) {
//				if(maxElem < nums[j]) {
//					maxElem = nums[j];
//				}
//			}
//			ans[idx++] = maxElem;
//		}
//		return ans;
//	}

	static int[] maximumOfAllSubarray(int[] nums, int k) {
		int[] ans = new int[nums.length - k + 1];
		int idx = 0;
		int windowStart = 0;
		int windowEnd = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			pq.add(nums[windowEnd]);

			if (windowEnd - windowStart + 1 == k) {
				int maxElem = pq.peek();
				ans[idx++] = maxElem;
				if (maxElem == nums[windowStart]) {
					pq.remove();
				}

				windowStart++;
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4 };
		int[] ans = maximumOfAllSubarray(nums, 2);
		System.out.println(Arrays.toString(ans));
	}
}
