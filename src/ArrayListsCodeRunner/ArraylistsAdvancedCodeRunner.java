package ArrayListsCodeRunner;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistsAdvancedCodeRunner {

	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String arvaus;
		
		
		ArrayList<String> ostokset = new ArrayList<String>();
		
		while (true) {
			System.out.println("Add item (x = exit)");
			arvaus = in.nextLine();
			
			
			if (arvaus.equals("x")) {
				break;
			}
			else {
				ostokset.add(arvaus);
			}
		
		}
		for (String ostos : ostokset) {
				System.out.println(ostos);
		}
	}

}
