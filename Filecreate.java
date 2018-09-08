//This Program is to create a file.
//Output: File created true/false.

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
 File file = new File("data.txt");
 try {
	boolean createnewfile = file.createNewFile();
	System.out.println("File created "+ createnewfile);
 }
 catch(IOException e) {
	 e.printStackTrace();
    }
	}
}
