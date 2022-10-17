package options;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class SearchFile {
	public boolean searchFile() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Directory obj = new Directory();
		String location = obj.getDirectory();
		
		System.out.print("Enter File name: ");
		String fileName = reader.readLine().toLowerCase();
		fileName += ".txt";
		boolean flag = false;
		
		File file = new File(location);
		File filedirec[] = file.listFiles();
		for(int i=0; i<filedirec.length; i++) {
			if(filedirec[i].getName().equals(fileName)) {
				System.out.println();
				System.err.println("File location is: "+filedirec[i].toString());
				System.out.println();
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println();
			System.err.println("File of this name do not exists.");
			System.out.println();
		}
		return flag;
	}
}