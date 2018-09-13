//This program is to print the unique elements of the string.
//Input: String.
//Output: Print unique elements.

import java.util.HashSet;
import java.util.Scanner;

public class remove {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 HashSet<Character> mySet = new HashSet<Character>();
 for(int i = 0; i < str.length(); i++) {
	 char ch = str.charAt(i);
	 if(mySet.contains(ch)) {
		 System.out.print("");
	 }
	 mySet.add(ch);
 }
 System.out.println(mySet);
	}
}
