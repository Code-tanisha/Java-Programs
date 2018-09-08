//This Program is to delete a file.
//Output: File deleted True/False. 

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
	File file = new File("data.txt");
	boolean delete = file.delete();
	System.out.println("File deleted "+delete);
 }
}
