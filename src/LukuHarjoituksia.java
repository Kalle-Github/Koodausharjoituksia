
public class LukuHarjoituksia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int luku1 = 5;
	    int luku2 = 5;
	    int luku3 = 6;
	    
	    if (luku1 == luku2) 
	    {
	      System.out.println("Luvut ovat yhtä suuria");
	    }
	    else
	    {
	      System.out.println("Luvut eivät ole yhtä suuria");
	    }
	    
	    
	    
	    
	    if (luku1 > luku2)
	    {
	      System.out.println("Luku1 on suurempi kuin luku2");
	    }
	    else
	    {
	      System.out.println("Luku1 on pienempi tai yhtäsuuri kuin luku2");
	    }
	    
	    
	    
	    
	    
	    
	    
	    //katsotaan onko nimi tommi
	    String nimi = "Tommi";
	    
	    if (nimi.equals("Tommi"))
	    {
	      System.out.println("Nimi on Tommi");
	    }
	    else
	    {
	      System.out.println("Nimi ei ole Tommi");
	    }
	    
	    //onko luku 1 ja 2 sekä 2 ja 3 yhtä suuria
	    
	    
	    if (luku1 == luku2 && luku2 == luku3)
	    {
	      System.out.println("Kaikki luvut ovat yhtä suuria");
	    }
	    else
	    {
	      System.out.println("Kaikki luvut eivät ole yhtä suuria");
	    }
	    
	    //onko luku 1 ja 2 tai 2 ja 3 yhtä suuria
	    
	    if (luku1 == luku2 || luku2 == luku3)
	    {
	      System.out.println("Luku1 ja luku2 tai luku2 ja luku3 ovat yhtä suuria");
	    }
	    else
	    {
	      System.out.println("Luku1 ja luku2 sekä luku2 ja luku3 eivät ole yhtä suuria");
	    }
	    
	    //onko luku1 suurempi kuin 2 ja onko luku1 yhtä suuri kuin 3
	    
	    if (luku1 > luku2 && luku1 == luku3)
	    {
	      System.out.println("luku1 on suurempi kuin luku2, sekä luku1 on yhtä suuri kuin luku3");
	    }
	    else
	    {
	      System.out.println("Luku1 ei ole suurempi kuin luku2, tai luku1 ei ole yhtä suuri kuin luku3");
	    }
	    
	    //, onko luku1 suurempi kuin luku2. Jos ei ole, onko luku2 suurempi kuin luku3
	    
	    if (luku1 > luku2)
	    {
	      System.out.println("luku1 on suurempi kuin luku2");
	    }
	    else if (luku2 > luku3)
	    {
	      System.out.println("Luku2 on suurempi kuin luku3");
	    }
	    else
	    {
	      System.out.println("Luku1 ei ole suurempi kuin luku2 tai luku2 suurempi kuin luku3");
	    }
	    //onko luku1 ja luku2 yhtä suuria. Jos ei ole, onko luku1 ja luku3 yhtä suuria
	    
	    if (luku1 == luku2)
	    {
	      System.out.println("Luku1 on yhtäsuuri kuin luku2");
	    }
	    else if (luku1 == luku3)
	    {
	      System.out.println("Luku1 on yhtä suuri kuin luku2");
	    }
	    else
	    {
	      System.out.println("luku1 ei ole yhtä suuri kuin luku2, eikä luku1 ole yhtä suuri, kuin luku3");
	    }
	    
	    //onko nimet samoja
	    
	    String nimi1 = "Petteri";
	    String nimi2 = "Petri";
	    String nimi3 = "Petteri";
	    
	    if (nimi1.equals(nimi2))
	    {
	      System.out.println("Nimi1 ja nimi2 ovat samoja");
	    }
	    else
	    {
	      System.out.println("nimi1 ja nimi2 ovat erilaisia");
	    }
		
		
		
	}

}
