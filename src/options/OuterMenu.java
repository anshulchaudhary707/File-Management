package options;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OuterMenu {
	public void outerMenu() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opt = 0;
		while(true) {
			System.out.println("Press 1 to Display All Files");
			System.out.println("Press 2 to Perform Operations on File");
			System.out.println("Press 3 to Exit");
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
			System.out.println();
			System.out.println();
			switch(opt) {
				case 1: {
					DisplayFiles obj = new DisplayFiles();
					String[] contents = obj.fetchFiles();
					if(contents.length == 0) {
						System.out.println();
						System.err.println("You have not created any file yet. So there are no files to display.");
						System.out.println();
					}else {
						System.out.println();
						System.out.println("The Files are: ");
						obj.displayFiles(contents);
						System.out.println();
						System.out.println();
					}
				}
				break;
				
				case 2: {
					InnerMenu obj = new InnerMenu();
					obj.innerMenu();
				}
				break;
				
				case 3: {
					System.out.println("THANKS FOR USING");
					System.exit(0);
				}
			}
		}
	}
}
