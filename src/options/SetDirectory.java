package options;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class SetDirectory {
	public boolean setDirectory() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Directory Where you want to create files: ");
		String string = reader.readLine();
		File f = new File(string);
		 
        if (f.exists()) {
        	System.out.println();
        	System.out.println("Directory Set Successfully");
        	Directory obj = new Directory();
        	obj.setDirectory(string);
        	return true;
        }
        
        else {
        	return false;
        }
	}
}