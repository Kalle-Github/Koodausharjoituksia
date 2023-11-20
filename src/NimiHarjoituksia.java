
public class NimiHarjoituksia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int ika = 40;

		// Tulostusehdot

		if (ika > 0 && ika < 18) {

		System.out.println("Olet alaikäinen");

		if (ika >= 15) {

		System.out.println("Saat ajaa mopoa"); }

		} else if (ika >= 65) {

		System.out.println("Olet eläkeläinen");

		} else {

		System.out.println("Olet aikuinen");

		 }
		 if (ika == 16 || ika == 17) 
		 {
		   System.out.println("Voit ajaa kevaria");
		 }
		 else if (ika == 18)
		 {
		   System.out.println("Onnea 18 vuoden iästä, voit ajaa nyt autoa");
		 }
		 
		 //% tarkoittaa jakojäännöstä eli mikä luku tulee pisteen jälkeen 
		if (ika % 10 == 0)
		{
		  System.out.println("Onnea Tasavuosikymmenen iästä");
		}
		if (ika == 100)
		{
		System.out.println("paljon onnea");
		System.out.println("100 vuoden");
		System.out.println("iästä!");
		}

		if (ika > 58 && ika < 65)
		{
		System.out.println("Voit mennä varhaiseläkkeelle!");
		}

		if (ika == 65)
		{
		  System.out.println("Hyviä eläkepäiviä");
		}

		if (ika > 39 && ika < 50)
		{
		System.out.println("Parasta keski-ikää teille");
		}

		
		
		
		
		
		
		
	}

}
