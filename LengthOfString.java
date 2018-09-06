//This Program is to find the length of a given String.
//Input: String.
//Output: Length of String

public class Main {
 public static void main(String[] args) {
   Main obj = new Main();
   obj.func("Tanisha Gupta");
	}
	public void func(String str) {
		int len = str.length();
		int count = 0;
		for(char ch:str.toCharArray()){
			count++;
		}
		System.out.println(count);
	}
}
