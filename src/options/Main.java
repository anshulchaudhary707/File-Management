package options;

public class Main {
	
	public static void main(String[] args) throws Exception {
		String textInBold = "APPLICATION NAME : FILE MANAGEMENT SYSTEM";
		System.out.print("\033[0;1m" + textInBold);
		System.out.println();
		System.out.println("Developed By : ANSHUL CHAUDHARY");
		System.out.println();
		System.out.println();
		
		Prerequisites obj1 = new Prerequisites();
		obj1.prerequisites();
		
		SetDirectory obj2 = new SetDirectory();
		boolean entry = obj2.setDirectory();
		while(entry == false) {
			System.out.println();
			System.err.println("No Such Directory Exists");
			System.err.println("Please enter correct Directory");
			System.out.println();
			entry = obj2.setDirectory();
		}
		
		OuterMenu obj3 = new OuterMenu();
		obj3.outerMenu();
	}
}