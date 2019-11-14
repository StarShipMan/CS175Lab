package MultiplicationTable;

public class MultiplicationtableVersion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%4s", "   ");
		for (int row = 1; row<= 10; row++) 
			System.out.printf("%4s", row);
		System.out.println();
		System.out.print("____________________________________________");
		for (int row = 1; row <= 10; row++) {
			System.out.println();
				System.out.printf("%4s", row +" |");
				for (int column = 1; column<=10; column++) {
					System.out.printf("%4s",   + column*row);
					
		}//for column
		}//for row
	}//main
}//class
