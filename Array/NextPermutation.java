package dsaSheetArray;

public class NextPermutation {
	
	public static void swap(int[] nums , int i , int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void reverse(int[] nums , int si , int li) {
		while(si<li) {
			swap(nums, si, li);
			si++;
			li--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3,4};
		
		int mark = -1;
		for(int i = nums.length-1 ; i > 0 ; i--) {
			if(nums[i] > nums[i-1]) {
				mark = i-1;
				break;
			}
		}
		if(mark == -1) {  
			reverse(nums, 0 , nums.length-1);
			return;
		}
		int indexFromWhereWeHaveToReverseArray = nums.length-1;  // we can give anything here.
		for (int i = nums.length-1; i >= mark; i--) {
			if(nums[mark] < nums[i]) {
				indexFromWhereWeHaveToReverseArray = i;
				break;
			}
		}
		swap(nums, mark, indexFromWhereWeHaveToReverseArray);
		reverse(nums, mark+1, nums.length-1);
		
		for (int i : nums) {
			System.out.print(i+ " ");
		}
		
	}
}
