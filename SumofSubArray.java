//Program to find continuous sub array of the given array whose sum is equal to a given number.
//Input: An Array & A integer.
//Output: Subarray whose sum is equal to given integer.
public class SubarraySumIsNum {
	public static void findsubarraysum(int[] inputArray, int inputNumber) {
		//Initializing the sum with the 1st element of the inputarray.
		int sum = inputArray[0];
		//Initializing the 1st elemnt as 0.
		int start = 0;
		//Iterating the inputarray from 2nd element.
		 for(int i=1; i<inputArray.length; i++) {
			 sum = sum + inputArray[i];
			 while(sum > inputNumber && start <= i-1) {
				 //Removing starting elements from the sum
				 sum = sum - inputArray[start];
				 start++;
			 }
			 if(sum == inputNumber) {
				 for(int j = start; j <= i; j++) {
					 System.out.print(inputArray[j]+" ");
				 }
				 System.out.println();
			 }
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findsubarraysum(new int[]{42, 15, 12, 8, 6, 32}, 26);
	}

}
