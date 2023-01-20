package Array;

class MinMax {
	int min;
	int max;
}

public class MinMaxInArray {

	static MinMax minMax(int[] arr, int low, int high) {
		MinMax minMax = new MinMax();
		MinMax mml = new MinMax();
		MinMax mmr = new MinMax();
		// only one element is present
		if (low == high) {
			minMax.max = arr[low];
			minMax.min = arr[low];
			return minMax;
		}
		// if there are only two elements present

		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				minMax.max = arr[low];
				minMax.min = arr[high];
			} else {
				minMax.min = arr[low];
				minMax.max = arr[high];
			}
			return minMax;
		}

		int mid = low + (high - low) / 2;

		mml = minMax(arr, low, mid);
		mmr = minMax(arr, mid + 1, high);
		
		if (mmr.min > mml.min) {
			minMax.min = mml.min;
		} else {
			minMax.min = mmr.min;
		}

		if (mml.max > mmr.max) {
			minMax.max = mml.max;
		} else {
			minMax.max = mmr.max;
		}

		
		return minMax;

	}

	public static void main(String[] args) {
		int arr[] = { 1000,  445, 1, 330, 100 ,0};
		MinMax pair = minMax(arr, 0, arr.length-1);
		System.out.println(pair.min + " "+ pair.max);
	}
}
