package options;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
	void deleteFile() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter File name: ");
		String name = reader.readLine();
		Directory obj = new Directory();
		String directory = obj.getDirectory();
		String filePath = directory+"\\"+name+".txt";
		//String filePath = "C:\\File_Handling\\"+name+".txt";
		Path newFilePath = Paths.get(filePath);
	    Files.delete(newFilePath);
	}
}
