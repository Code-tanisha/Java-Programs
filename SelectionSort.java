//This Program is for implementation of Selection sort.
//Input: Unsorted Array.
//Output: Sorted Array.

public class Selection {
	public static void sort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j < n; j++)
				if(arr[j] < arr[min])
					min = j;
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public static void printarr(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Selection ob = new Selection();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printarr(arr);

	}
}
