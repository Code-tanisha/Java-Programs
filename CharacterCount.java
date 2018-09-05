//Count each character in the given String.
//Input: String.
//Output: Count of each character present in the string.

import java.util.HashMap;
public class Count {
	public static void CharacterCount(String input){
		//Create a HashMap which contains character and Integer
		HashMap<Character, Integer> countchar = new HashMap<Character,Integer>();
		char[] strArray = input.toCharArray();
		for(char c : strArray) {
			if(countchar.containsKey(c)) {
				countchar.put(c, countchar.get(c)+1);
				
			}else {
				countchar.put(c, 1);
			}
		}
		System.out.println(countchar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Count obj = new Count();
		obj.CharacterCount("Java J2EE Java JSP J2EE");
	}
}
