package ListatCodeRunner;

import java.util.Scanner;

public class TaulukkoCodeRunnerAdvanced {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
	double[] javelinThrows;
	javelinThrows = new double [3];
	
	for (int i = 0; i < 3; i++)
	{
		System.out.println("Throw length");
		javelinThrows[i] = in.nextDouble();
		
	}
	
	
	for (int i = 0; i < 3; i++) 
	{
		System.out.println("Throw " + (i + 1) + ": " + javelinThrows[i]);
	}
	
	
	}

}
