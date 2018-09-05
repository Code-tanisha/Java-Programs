import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int p = 0;
 int q = 1;
 int r;
 
 for(int i = 2; i <= n; i++){
	 r = p+q;
	 p=q;
	 q=r;
	 System.out.println(r);
 }
	}

}
