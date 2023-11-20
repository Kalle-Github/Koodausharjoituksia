import java.util.Scanner;

public class Koodauskoe3 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	String exerciselevel;
	int exercisetime = 0;
	String input;
	String input2;
	int activityamount = 0;
	
	
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		exerciselevel = in.nextLine();
		
		
		
		//kayttajalta kysytaan kuinka monta minuuttia han liikkui 7 paivan aikana.
	for (int i = 1; i < 8; i++)
	{
		System.out.println("Minutes on " + i + ". " + "day?");
		input = in.nextLine();
		exercisetime = exercisetime + Integer.parseInt(input);
	

	}
	//kayttajalta kysytaan kuinka monta kertaa teki lihas- ja tasapainoharjoituksia
	System.out.println("How many times you did muscle strengthening and balance activities?");
	input2 = in.nextLine();
	activityamount = activityamount + Integer.parseInt(input2);
	
	System.out.println("You did " + exercisetime + " minutes " + exerciselevel + " exercise during week.");
		
		checkActivityRecommendation (exerciselevel, exercisetime, activityamount);
	}
	
	//Tarkistetaan onko kayttaja harjoitellut suosituksien mukaan
	public static void checkActivityRecommendation(String exerciselevel, int exercisetime, int activityamount)
	{
		if (exerciselevel.equals("vigorous") && exercisetime >= 75 && activityamount >= 2)
		{
			System.out.println("You exercise enough according to the recommendations!");
		}
		else if (exerciselevel.equals("moderate") && exercisetime >= 150 && activityamount >= 2)
		{
			System.out.println("You exercise enough according to the recommendations!");
		}
		else 
		{
			System.out.println("You should exercise more!");
		}
		
	}

}