

import java.util.Arrays;

public class BasicArraySort {

	public static void main(String[] args) {
		//declare local variables
		double [] numb= {88,47,90,50,77,83,92,62,79};
		double lowest = 0;
		String printedNumbers; 

		//for
		for (int x = 0; x <numb.length; x++){
			for(int y= x; y < numb.length; y++) {
				if (numb[x]  > numb[y]) {
					lowest = numb[x];
					numb[x] = numb[y];
					numb[y] = lowest;

				}	
			}



		}	
		//print array
		printedNumbers = Arrays.toString(numb);
		System.out.print(printedNumbers);	

	}
}
