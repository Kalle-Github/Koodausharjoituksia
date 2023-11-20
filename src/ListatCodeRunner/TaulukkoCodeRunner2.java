package ListatCodeRunner;
import java.util.Scanner;
public class TaulukkoCodeRunner2 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int valinta;		
		
		String[] viisaudet =  new String[4];
		viisaudet[0] = "Actions speak louder than words.";
		viisaudet[1] = "A barking dog never bites.";
	    viisaudet[2] = "A penny saved is a penny earned.";
	    viisaudet[3] = "All things come to those who wait.";
	    
	    System.out.println("Pick number from 1-4.");
	    valinta = in.nextInt();
	    System.out.println(viisaudet[valinta + -1]);
	    
	}

}
