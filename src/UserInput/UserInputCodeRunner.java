package UserInput;
import java.util.Scanner;

public class UserInputCodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        
		String input;
		String input2;
		
       System.out.println("What is your name?");
       input = in.nextLine();
        if (input.equals(""))
        {
        	System.out.println("Error");
        }
       System.out.println("How old are you?");
       input2 = in.nextLine();
       if (input2.equals(""))
       {
    	   System.out.println("Error");
       }
       
       System.out.println("Your name is " + input + " and you are " + input2 + " years old.");
        
        
        
	}

}
