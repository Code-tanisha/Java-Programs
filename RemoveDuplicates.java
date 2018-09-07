//This Program is to check for duplicates in an Array.
//Input: An Array.
//Output: Remove duplicate elements.

import java.util.Scanner;
public class Array {
	public static int removeDuplicates(int[] arr, int n){
		 if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  

	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40,50,50};  
	        int length = arr.length;  
	        length= removeDuplicates(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
  }
 }
