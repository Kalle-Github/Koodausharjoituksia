package UserInput;
import java.util.Scanner;

public class UserInputCodeRunner2 {

	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		
		int input;
		int input2;
		int sum;
		
		System.out.println("First number?");
		input = in.nextInt();
		
		System.out.println("Second number?");
		input2 = in.nextInt();
		
		
		sum = input + input2;
		
		System.out.println(input + " + " + input2 + " = " + sum);
		

	}

}
