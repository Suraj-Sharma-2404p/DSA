package slidingWindowQuestions;

//Given an array of positive integers nums and a positive number K, find the length of the smallest contiguous subarray whose sum is equal to K. Return 0 if no such subarray exists.
public class SmallestSubarrayWithSumK {
	static int lengthOfMinSubarray(int[] nums , int k) {
		int n = nums.length;
		int lengthOfSmallestSubarray = Integer.MAX_VALUE;
		
		for(int i =0 ; i < n ; i++) {
			int currentSubarraySum = 0;
			for(int j = i ; j < n ; j++) {
				currentSubarraySum += nums[j];
				if(currentSubarraySum == k) {
					lengthOfSmallestSubarray = Math.min(lengthOfSmallestSubarray, j-i+1);
					break;
				}
				if(currentSubarraySum > k) {
					break;
				}
			}
		}
		return lengthOfSmallestSubarray == Integer.MAX_VALUE ?0 : lengthOfSmallestSubarray;
	}
	public static void main(String[] args) {
		int[] nums = new int[] {3, 4, 1, 1, 2, 1};
		int ans = lengthOfMinSubarray(nums, 9);
		System.out.println(ans);
	}
}
