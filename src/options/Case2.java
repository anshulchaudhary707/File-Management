package options;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.FileAlreadyExistsException;

public class Case2 {
	public boolean call(){
		DeleteFile obj = new DeleteFile();
		boolean enter = true;
		try {
			obj.deleteFile();
			enter = false;
			System.out.println();
			System.err.println("File Deleted Successfully");
			System.out.println();
		}
		catch(FileAlreadyExistsException e) {
			System.out.println();
			System.err.println("File of this name already exists. Please create a file with different name !!");
			System.out.println();
		}
		catch(Exception e) {
			System.out.println();
			System.err.println(e.toString());
			System.out.println();
		}
		return enter;
	}
	public boolean callHelp() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean enter = true;
		System.out.println("Press 10 to delete a file with another name.");
		System.out.println("Press 20 to go Back.");
		int val = 0;
		try {
			val = Integer.parseInt(reader.readLine());
		}

		catch(NumberFormatException e) {
			System.out.println();
			System.err.println("Number Format Exception");
			System.out.println();
			return true;
		}
		catch(Exception e) {
			val = 30;
			e.printStackTrace();
		}
		
		switch(val) {
			case 10:{
				try {
					enter = call();
				}
				catch(Exception e) {
					System.out.println();
					System.err.println(e.toString());
					System.out.println();
				}
			}
			break;
			
			case 20: {
				System.out.println();
				System.err.println("Moved Back");
				System.out.println();
				enter = false;
			}
			break;
			
			default: {
				System.out.println();
				System.err.println("Choose from the given option");
				System.out.println();
			}
			System.out.println();
		}
		return enter;
	}
}
