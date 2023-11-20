package UserInput;
import java.util.Scanner;

public class UserInputHarjoitus {

	public static void main(String[] args) {
		
		
		//1, 	vähän alkuvalmisteluja
		//2. jos syötettä on tarkoitus käyttää laskutoimituksessa pitää tehdä muunnos
		Scanner in = new Scanner(System.in);
		//ilman tätä koodi ei pysty lukemaan käyttäjän kirjoitusta

		String vastaus;
		int luku;
		int tulos;
		
		
		System.out.println("Kirjoita jotain. Toistan sen");
		
		vastaus = in.nextLine();
		
		System.out.println(vastaus);
		
		
		
		System.out.println("Kirjoita luku, kerron sen kahdella");
		vastaus = in.nextLine();
		luku = Integer.parseInt(vastaus);
		
		tulos = luku * 2;
		
		System.out.println("Tulos on " + tulos);
		
		
		
		
		
	}

}
