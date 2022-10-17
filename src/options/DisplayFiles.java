package options;

import java.io.File;

public class DisplayFiles {
	public String[] fetchFiles() {
		Directory obj = new Directory();
		String location = obj.getDirectory();
		
		File directoryPath = new File(location);
		
		String contents[] = directoryPath.list();
		return contents;
	}
	
	public void displayFiles(String[] files) {
		for(int i=0;i<files.length;i++) {
			System.out.println((i+1)+": "+files[i]);
		}
	}
}
