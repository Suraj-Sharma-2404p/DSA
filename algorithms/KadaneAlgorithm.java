package algortithms;

//or we can also say maximum sum subarray 
public class KadaneAlgorithm {

	static int solution(int[] array) {
		int csum = array[0];
		int osum = array[0];
		

			for (int i = 1; i < array.length; i++) {
				if (csum >= 0) {
					csum += array[i]; //if prev sum is coming as positive we add to it
				} else {
					csum = array[i]; // if neg we initialise sum with Ith elem.
				}
				if (csum > osum) {
					osum = csum;
				}
			}
			return osum;
		
	}

	public static void main(String[] args) {
		int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(solution(array));

	}

}
