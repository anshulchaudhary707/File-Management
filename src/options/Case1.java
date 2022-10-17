package options;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.FileAlreadyExistsException;

public class Case1 {
	public boolean call(){
		AddFile obj = new AddFile();
		boolean enter = true;
		try {
			obj.addFile();
			enter = false;
			System.out.println();
			System.err.println("File added successfully");
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
		System.out.println("Press 10 to create with another name.");
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