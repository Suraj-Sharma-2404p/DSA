package twoPointerQuestions;
//the array given is sorted. 
public class PairHavingSumK {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 4, 5, 5, 5, 6, 6, 11 };
		int k = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					System.out.println("the pair is " + "(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
	}

}
