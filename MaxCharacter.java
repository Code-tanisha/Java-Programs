//This Program is to find the Maximum occurring character in a String.
//Input: String.
//Output: Maximum occurred character.

import java.util.Scanner;
public class maxOccurance {
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String str = sc.next();
 char[] newstr = str.toCharArray();
 int count = 0;
 for(int i = 0; i < str.length(); i++){
	 for(int j = i+1; j < str.length(); j++){
		 if(newstr[i] == newstr[j]) {
			 System.out.print(newstr[j]);
			 count++;
			 break;
		   }
      }
    }
  }
}
