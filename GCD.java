//This Program is to find GCD of 2 nos.
//Input: Two Integers.
//Output: GCD
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int p = sc.nextInt();
int g = sc.nextInt();
int r = 0;
while(g!=0) {
	r = p%g;
	p = g;
	g = r;
	
}
 System.out.print(p);
	sc.close();
	}
}
