package options;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InnerMenu {
	public void innerMenu() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opt = 0;
		boolean display = true;
		while(display == true){
			System.out.println("Press 1 to Add a File");
			System.out.println("Press 2 to Delete a File");
			System.out.println("Press 3 to Search a File");
			System.out.println("Press 4 to go to Main Menu");
			System.out.println();
			System.out.print("Your Option: ");
			
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
			switch(opt) {
			case 1: {
				Case1 c1 = new Case1();
				boolean enter = c1.call();
				while(enter == true) {
					c1 = new Case1();
					enter = c1.callHelp();
				}
			}
				break;
				
			case 2: {
				
				Case2 c2 = new Case2();
				boolean enter = c2.call();
				while(enter == true) {
					c2 = new Case2();
					enter = c2.callHelp();
				}
			}
				break;
			
			case 3: {
				Case3 c3 = new Case3();
				boolean enter = c3.call();
				while(enter == false) {
					c3 = new Case3();
					enter = c3.callHelp();
				}
			}
				break;
				
				case 4: {
					System.err.println("Moved to Main Menu");
					display = false;
				}
					break;
				
				default: {
					System.out.println();
					System.err.println("Choose from the given option");
					System.out.println();
				}
					break;
			}
		}
	}
}
