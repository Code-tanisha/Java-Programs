//This Program is to Remove spaces from a String.
//Input: String.
//Output: String without Spaces.

public class Main {

	public static void main(String[] args) {
      String str = "India is my contry";
      char[] strArray = str.toCharArray();  
      StringBuffer stringBuffer = new StringBuffer();  
      for (int i = 0; i < strArray.length; i++) {  
          if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
              stringBuffer.append(strArray[i]);  
    	  }
      }
      String noSpacestr = stringBuffer.toString();
      System.out.print(noSpacestr);
	}
}
