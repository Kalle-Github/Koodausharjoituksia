package ListatCodeRunner;
import java.util.Arrays;

public class TaulukkoHarjoitus {

	public static void main(String[] args) {
		
		
		int[] lampotilat = new int[7];
		
		lampotilat[0] = 18;
		lampotilat[1] = 19;
		lampotilat[2] = 24;
		lampotilat[3] = 22;
		lampotilat[4] = 16;
		lampotilat[5] = 15;
		lampotilat[6] = 14;
		
		// Keskiviikon lämpötilan tulostus, eli 3. solu, indeksi 2
		System.out.println(lampotilat[2]);
		
		// Koko taulokon tulostus
		
		int summa = 0;
		
		System.out.println("Viikon lämpötilat");
		
		for (int i = 0; i < lampotilat.length ; i++) {
			System.out.println(lampotilat[i]);
			summa = summa + lampotilat[i];
			}
		System.out.println("Summa on");
	System.out.println(summa);
	System.out.println("Järjestetään taulukko");
	//järjestää taulukon
	Arrays.sort(lampotilat);
	
	for (int i = 0; i < 7; i++){
		System.out.println(lampotilat[i]);
	}
		
	System.out.println("kylmin lämpötila on " + lampotilat[0]);
	System.out.println("Lämpimin lämpötila on " + lampotilat[lampotilat.length-1]);
		
	}

}
