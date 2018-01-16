package jsez17.DataStructure;

public class QuickSort {

	// QuickSort is a very fast and efficient sort method
	// Its strategy is to conquer and divide by rearranging the elements keys by two sublists
	// One list with the lower keys and another with the higher keys, than its sorts both
	
	static void asceding(int[] arr, int start, int finish) {
		if(start < finish) {
			int pivot = divideAscending(arr, start, finish);
			asceding(arr, start, pivot - 1);
			asceding(arr, pivot + 1, finish);
		}
	}

	static int divideAscending(int[] arr, int start, int finish) {
		
		int pivot = arr[start];
		int s = start + 1;
		int f = finish;
		
		while(s <= f) {
			if(arr[s] <= pivot) {
				s++;
			} else if(pivot < arr[f]) {
				f--;
			} else {
				int change = arr[s];
				arr[s] = arr[f];
				arr[f] = change;
				s++;
				f--;
			}
		}
		
		arr[start] = arr[f];
		arr[f] = pivot;
		return f;
		
	}
	
	static void desceding(int[] arr, int start, int finish) {
		if(start < finish) {
			int pivot = divideDescending(arr, start, finish);
			desceding(arr, start, pivot - 1);
			desceding(arr, pivot + 1, finish);
		}
	}

	static int divideDescending(int[] arr, int start, int finish) {
		
		int pivot = arr[finish];
		int s = start;
		int f = finish - 1;
		
		while(s <= f) {
			if(arr[s] >= pivot) {
				s++;
			} else if(pivot > arr[f]) {
				f--;
			} else {
				int change = arr[s];
				arr[s] = arr[f];
				arr[f] = change;
				s++;
				f--;
			}
		}
		
		arr[finish] = arr[s];
		arr[s] = pivot;
		return s;
		
	}
	
	static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {4, 9, 1, 2, 5};
		
		QuickSort.print(arr);
		
		System.out.println();
		
		QuickSort.asceding(arr, 0, arr.length - 1);
		
		QuickSort.print(arr);
		
		System.out.println();
		
		QuickSort.desceding(arr, 0, arr.length - 1);
		
		QuickSort.print(arr);
		
	}
}
