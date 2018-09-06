//This Program is to swap two integer values with a temporary variable.
//Input: Two no.
//Output: Swapped no.
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int temp;
temp = x;
x=y;
y=temp;
System.out.println("After Swapping\n x="+x+"\n y="+y);
	}
}
