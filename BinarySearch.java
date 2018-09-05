//This program is for Binary search.
//Input: Array of integers.
//Output: Index of the element found in the array.

import java.util.Scanner;

public class MyBinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//Enter the total no. of elements in the array
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++) {
	//input elements in the array of size n
	arr[i]=sc.nextInt();
}
System.out.println("Enter value to be searched:");
// enter the value to be searched
int num = sc.nextInt();
int low=0;
int high = n-1;
int mid = 0;
while(low<=high) {
	mid = (low+high)/2;
	
if(arr[mid]==num) {
	System.out.println("Value found at index"+ mid);
	break;
}
else if(arr[mid]>num) {
	high = mid-1;
}
else if(arr[mid]<num) {
	low = mid+1;
}
}
if(low>high) {
	System.out.println("number is not found :");
   }
  }
}
