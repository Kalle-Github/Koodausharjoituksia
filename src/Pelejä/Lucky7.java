package Pelejä;
import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		int luku, luku2, luku3;
		int raha = 5;
		String vastaus;
		int vastaus2;
		int seiskat;
		String vastaus3;
		
		
		System.out.println("Kuinka paljon rahaa haluat syöttää");
		vastaus2 = Integer.parseInt(in.nextLine());
		raha = vastaus2;
		System.out.println("Haluatko pelata? Paina enter pelataksesi tai e peruuttaaksesi");
		
			do {
				System.out.println("Sinulla on " + raha + " € Peli maksaa 1€");
				
				
			vastaus = in.nextLine();	 
			
			
			
			
			if (vastaus.equals("")) {
				raha -= 1;
				luku = random.nextInt(10) + 1;
				luku2 = random.nextInt(10) + 1;
				luku3 = random.nextInt(10) + 1;
				
				System.out.println(luku);
				System.out.println(luku2);
				System.out.println(luku3);
				
			if (raha == 0) {
				System.out.println("Rahat loppuivat");
			}
				
				seiskat = 0;
				if (luku == 7) {
					seiskat++;
				}
				if (luku2 == 7) {
					seiskat++;
				}
				if (luku3 == 7) {
					seiskat++;
				}
				
				
				
				
				if (seiskat == 1) {
					raha += 3;
					System.out.println("Sait yhden seiskan, voitat 3€");
				}
				
				if (seiskat == 2) {
					raha += 5;
					System.out.println("Sait kaksi seiskaa, voitat 5€");
				}
				if (seiskat == 3) {
					raha += 10;
					System.out.println("Sait kolme seiskaa, voitat 10€");
				}
				
					else {
						System.out.println("Ei voittoa tällä kertaa");	
						}
				
				
			}else if (vastaus.equals("e")) {
					break;
				}
			
			
				else {
					System.out.println("Virheellinen syöte");
				}
			System.out.println("Haluatko pelata uudestaan? Paina enter pelataksesi tai e peruuttaaksesi");
			
			}while (raha > 0);
			
			

		
		}
	}

