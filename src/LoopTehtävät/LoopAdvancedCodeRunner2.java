package LoopTehtävät;
import java.util.Scanner;

public class LoopAdvancedCodeRunner2 {

	public static void main(String[] args) {
	
		
		String Emma;
		String arvaus;
		int laskuri = 0;
		String oikeavastaus = "Emma";
		
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		do
		{
		System.out.println("Guess my name (type stop to exit)");
		laskuri++;
		arvaus = in.nextLine();
		
		if (arvaus.equals(oikeavastaus))
			{
					System.out.println("Congratulations!");
					System.out.println("You guessed " + laskuri + " times.");
					break;
			}
		else if (arvaus.equals("stop"))
				{
			laskuri--;
			System.out.println("You guessed " + laskuri + " times.");
					break;
				}
		}
		while (true);

	}

}
