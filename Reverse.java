//This Program is to reverse a String
//Input: String
//Output: Reversed String

public class Reverse {

	public static void main(String[] args) {
String str = "Tanisha";
int len = str.length();
String str1 = " ";
int pos = len-1;
for(int i=0;i<=len-1;i++) {
	char ch = str.charAt(pos);
	str1 = str1+ch;
	pos--;
}
System.out.println(str1);
	}
}
