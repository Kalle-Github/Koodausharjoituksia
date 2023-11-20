package LoopTehtävät;
import java.util.Scanner;

public class LoopExtraCodeRunner {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int input;
		System.out.println("How many rows?");
		input = in.nextInt();
		
		
		for (int laskuri = 0; laskuri < input; laskuri++){
	
			
			for (int laskuri3 = 1; laskuri3 < input - laskuri; laskuri3++){
				System.out.print(" ");
			}
		
			for (int laskuri2 = -1; laskuri2 < laskuri; laskuri2++) {
			System.out.print("*");
			}
					
			
			System.out.println();
		}
		
		
			
	}
	

}
