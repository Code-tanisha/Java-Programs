//This Program is for checking Prime no. or not.
//Input: An Integer.
//Output: Prime / Not Prime.

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
 int m = num/2;
 int flag = 0;
 if(num==0 || num==1) {
	 System.out.println("Not Prime");
 }
 else {
	 for(int i = 2; i < m; i++) {
		 if(num % i == 0) {
			 System.out.println(num+" Not Prime");
			 flag = 1;
			 break;
		 }
	 }
	 if(flag == 0) {
		 System.out.println(num+" Prime");
	  }
	 }
	}
}
