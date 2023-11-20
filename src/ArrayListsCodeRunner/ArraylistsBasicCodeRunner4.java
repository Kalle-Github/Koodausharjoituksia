
package ArrayListsCodeRunner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArraylistsBasicCodeRunner4 {

	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Kia");
	    cars.add("Tesla");
	    cars.add("BMW");
	    cars.add("Renault");
	    
	    for (int i=0; i < cars.size(); i++) {
	    	System.out.println(cars.get(i));
	    }
	    
	    System.out.println("MODIFIED LIST");
	    
	    cars.set(1, "Ford");
	    cars.set(2,  "Audi");
	    
	    
	    for (int i=0; i < cars.size(); i++) {
	    	System.out.println(cars.get(i));
	    }
	    
	    System.out.println("SORTED LIST");
	    
	    Collections.sort(cars);
	    
	    for (int i=0; i < cars.size(); i++) {
	    	System.out.println(cars.get(i));
	    }
	}

}
