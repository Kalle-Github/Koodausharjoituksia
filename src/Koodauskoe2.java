import java.util.Scanner;

public class Koodauskoe2 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	String exerciselevel;
	int exercisetime = 0;
	String input;
	
	
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		exerciselevel = in.nextLine();
		
		
		
		
	for (int i = 1; i < 8; i++)
	{
		System.out.println("Minutes on " + i + ". " + "day?");
		input = in.nextLine();
		exercisetime = exercisetime + Integer.parseInt(input);
	

	}
	System.out.println("You did " + exercisetime + " minutes " + exerciselevel + " exercise during week.");
		
		
	}

}
