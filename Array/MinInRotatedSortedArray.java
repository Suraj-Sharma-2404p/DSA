package dsaSheetArray;

public class MinInRotatedSortedArray {
	// Brute Force approach
	public static int solution(int[] nums) {

		int min = Integer.MAX_VALUE;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	// Optimized approach

	public static int solution2(int[] nums, int si, int li) {
		return li;}

	public static void main(String[] args) {
		int[] nums = new int[] {4,5,6,7,0,1,2};
		// System.out.println(solution(nums));
		System.out.println(solution2(nums, 0, nums.length - 1));
	}
}
