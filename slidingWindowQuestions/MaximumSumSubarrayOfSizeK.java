package slidingWindowQuestions;

public class MaximumSumSubarrayOfSizeK {
	static int maximumSum(int[] arr, int k) {
		if (k == 0 || arr.length == 0) {
			return 0;
		}
		int maxsum = Integer.MIN_VALUE;
		int windowStart = 0;
		int windowSum = 0;
		int windowend = 0;
		for (windowend = 0; windowend < arr.length; windowend++) {
			windowSum += arr[windowend];

			if (windowend - windowStart + 1 == k) {
				maxsum = Math.max(windowSum, maxsum);
				windowSum -= arr[windowStart];
				windowStart++;
			}
		}
		return maxsum;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(maximumSum(arr, 3));
	}
}
