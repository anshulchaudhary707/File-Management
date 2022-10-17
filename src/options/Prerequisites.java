package options;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prerequisites {
	public void prerequisites() {
		System.out.println("Some Important Prerequisites: ");
		System.out.println("1: Before continuing you are requested to create the directory where you want to install your files.");
		System.out.println("2: And give the location of the directory when you are asked. Please give a valid directory.");
		System.out.println();
		System.out.println();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Boolean loop = true;
		while(loop == true) {
			System.out.println("Enter 1 once you read all the prerequisites.");
			System.out.println("Enter 2 to stop the application.");
			System.out.print("Your Choice: ");
			int opt = 0;
			try {
				opt = Integer.parseInt(reader.readLine());
			}
			catch(NumberFormatException e) {
				System.out.println();
				System.err.println("Number Format Exception");
				System.out.println();
				continue;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println();
			
			switch(opt) {
				case 1: {
					loop = false;
				}
				break;
				
				case 2: {
					System.out.println("Application closed !");
					System.exit(0);
				}
				break;
				
				default: {
					System.err.println("Choose from the given option only.");
				}
				break;
			}
		}
	}
}