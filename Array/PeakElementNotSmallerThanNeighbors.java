package Array;

public class PeakElementNotSmallerThanNeighbors {
	
	static int indexSearch(int [] arr , int start , int end) {
		
		int mid = start + (end-start)/2;
		
		if ((mid == 0 || arr[mid-1]<= arr[mid]) && (mid == arr.length-1 || arr[mid+1]<= arr[mid]) ) {
			return mid;
		}
		
		else if (mid>0 && arr[mid-1] > arr[mid]) {
			indexSearch(arr, start, mid-1);
		}else {
			indexSearch(arr, mid+1, end);
		}
		return mid;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr= { 100,80,60,50,20};
		System.out.println(indexSearch(arr, 0, arr.length-1));
	}
}
