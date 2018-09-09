//This Program is to count the no. of words in a String.
//Input: String.
//Output: No. of words.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "My name is Tanisha";
int count = 1;
for(int i = 0; i<s.length();i++){
	char ch = s.charAt(i);
	if(( s.charAt(i) == ' ') && ( s.charAt(i+1) != ' ')) {
		count = count+1;
	}
	
}
System.out.println("No of words in this are:"+count);
	}
}
