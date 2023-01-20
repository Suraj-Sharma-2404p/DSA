package algortithms;

public class QuickSort {
	
	static void quickSort(int[] arr , int low , int high) {
		
		if(low < high) {
			int pidx = partition(arr,low,high);
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
		}
	}
	
 	 static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j = low ; j< high ; j++) {
			if(arr[j]< pivot) {
				i++;
				swap(arr, i ,j);
			}
		}
		i++;
		swap(arr,i,high);
		return i;
	}

	 static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		
	}
}
