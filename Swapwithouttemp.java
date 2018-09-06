//This Program is to swap two no. without temp. variable.
//Input: Two Integers.
//Output: Swapped.
import java.util.Scanner;
public class Swapp {
   public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
x= x+y;
y=x-y;
x=x-y;
System.out.println("Swapping After\nx="+x+"\ny="+y);
	}

}
