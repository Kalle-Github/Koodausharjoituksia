package LoopTehtävät;
import java.util.Scanner;

public class LoopAdvancedCodeRunner {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int ensimmäinen;
		int viimeinen;
		
		System.out.println("First number?");
		ensimmäinen = Integer.parseInt(in.nextLine());
		
		System.out.println("Last number?");
		viimeinen = Integer.parseInt(in.nextLine());
		
		for (int laskuri = ensimmäinen ; laskuri < (viimeinen + 1) ; laskuri++)
		{
			System.out.println(laskuri);
		}

		
		
		
		
	}

}
