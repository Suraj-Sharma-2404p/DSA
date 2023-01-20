package algortithms;

public class EvenDigits {
	
	static int findNumbers(int[] nums) {
		
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
		
		
	}
	private static boolean even(int num) {
		int numberOfDigits = count(num);
		
		return numberOfDigits %2 == 0;
	}
	static int count(int num) {
		int count = 0;
		if(num <0 ) {
			num = num * -1;
		}
		
		if(num == 0) {
			return 1;
		}
		while(num > 0) {
			count++;
			num = num/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] nums = {1321,23,3435,32,334343,5454,-22,0};
		System.out.println(findNumbers(nums));
	}
}
