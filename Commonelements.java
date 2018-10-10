//Program is to print common elements in 2 arrays.
//Input: 2 arrays.
//Output: Print common elements.

import java.util.HashSet;
public class CommonElements {
 public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN"};
		HashSet <String> set = new HashSet<String>();
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i].equals(s2[j])) {
				set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
    }
}
