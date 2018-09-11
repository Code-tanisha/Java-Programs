//This program is to find the largest and smallest no. in an unsorted array.
//Input: Unsorted Array.
//Output: Largest and Smallest element.

public class array {

	public static void main(String[] args) {
		int arr[] = {32,43,53,54,32,65,63,98,43,23};
		int len = arr.length;
		int largest = arr[0];
		int smallest = arr[0];
		for(int i = 0; i < len; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			else if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
  }
}
