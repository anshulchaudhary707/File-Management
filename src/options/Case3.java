package options;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Case3 {
	public boolean call(){
		SearchFile obj = new SearchFile();
		boolean enter = true;
		try {
			enter = obj.searchFile();
			System.out.println();
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
		System.out.println("Press 10 to search a file with another name.");
		System.out.println("Press 20 to go Back.");
		int val = 0;
		try {
			val = Integer.parseInt(reader.readLine());
		}

		catch(NumberFormatException e) {
			System.out.println();
			System.err.println("Number Format Exception");
			System.out.println();
			return false;
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
				enter = true;
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