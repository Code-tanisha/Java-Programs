//This Program is to Check that a no. is palindrome or not.
//Input: Integer value.
//Output: Palindrome /Not Palindrome 
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
int r, sum = 0,temp;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
temp = n;
while(n>0) {
	r = n%10;
	sum = (sum*10)+r;
	n = n/10;
}
if(temp == sum)
	System.out.print("Palindrome");
else
	System.out.print("Not a Palindrome");
	}
}
