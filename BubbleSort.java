//Program is for Bubble sorting
//Output is sorted Array
import java.util.Scanner;
public class Sort {
	public static int[] bubbleSort(int[] numbers) {
		//Enter the length of the Array
		int n = numbers.length;
		for(int pass=1;pass<=n;pass++) {
			for(int current=0;current<n-pass;current++) {
				if(numbers[current]>numbers[current+1]) {
					int temp = numbers[current];
					numbers[current] = numbers[current+1];
					numbers[current+1] = temp;
				}
			}
		}
		return(numbers);
	}

	public static void printArray(int[] numbers) {
		int len = numbers.length;
		for(int i=0;i<len;i++) {
			System.out.println(numbers[i]);
		}
	}
	public static void main(String[] args) {
		
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int arr[] = new int[n];
 for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
	 
 }
 printArray(arr);
 int[] sortedArray = bubbleSort(arr);
 System.out.println("\n sorted array are-");
 printArray(sortedArray);
	}

}
