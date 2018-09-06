//Program is to find the repeated characters in String
//Input: String
//Output: Repeated characters
import java.util.Arrays;
import java.util.Scanner;
public class removechars {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   str = str.toLowerCase();
   
   char[] chararr = str.toCharArray();
   
   int count = 0;
   for(int i = 0; i < chararr.length; i++){
	   for(int j = i+1; j < chararr.length; j++){
		  if(chararr[i] == chararr[j]){
			  System.out.print(chararr[i]);
			  count++;
			  break;
		  }
	   }
    }
	}
}
