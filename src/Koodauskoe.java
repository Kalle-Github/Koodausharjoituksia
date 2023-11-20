
public class Koodauskoe {

	public static void main(String[] args) {
		
		

	
	}

public  void checkActivityRecommendation(String activityLevel, int amount)
{
	if (activityLevel == "vigorous" && amount >= 75)
	{
		System.out.println("You exercise enough according to the recommendations!");
	}
	else if (activityLevel == "moderate" && amount >= 150)
	{
		System.out.println("You exercise enough according to the recommendations!");
	}
	else 
	{
		System.out.println("You should exercise more!");
	}
}
		 
}