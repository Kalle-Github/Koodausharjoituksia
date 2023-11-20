package ArrayListsCodeRunner;

public class ArraylistsBasicCodeRunner2 {

	public static void main(String[] args) {
	
		int summa = 0;
		int[] luvut;
		luvut = new int[3];
		
		luvut[0] = 3;
		luvut[1] = 6;
		luvut[2] = 1;
		
		
		for (int i = 0; i < luvut.length; i++) {
		summa = summa + luvut[i];
		
		}
		System.out.println(summa);
	}

}
