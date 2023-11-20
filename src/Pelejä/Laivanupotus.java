package Pelejä;

public class Laivanupotus {

	public static void main(String[] args) {

		
		String[][] taulukko = {
				{" ", "1", "2", "3", "4", "5"},
				{"1", "O", "O", "O", "O", "O"},
				{"2", "O", "O", "O", "O", "O"},
				{"3", "O", "O", "O", "O", "O"},
				{"4", "O", "O", "O", "O", "O"},
				{"5", "O", "O", "O", "O", "O"},
		};

		for (int rivi = 0; rivi < taulukko.length; rivi++) {
			for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {
				System.out.print(taulukko[rivi][sarake] + " ");
			}
			System.out.println();
		}
	
		
		
		
		
		

	}

}
