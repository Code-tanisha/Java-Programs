//This Program is to reverse each word in a String.
//Input: String.
//Output: Reverse words.
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 String[] words = str.split(" ");
 for(int i = 0; i < words.length; i++) {
	 String word = words[i];
	 String reverseword = " ";
	 for(int j = word.length()-1; j >= 0; j--) {
	 reverseword = reverseword + word.charAt(j);
 }
	 System.out.print(reverseword); 
  }
 }
}
