package CodeGradeTranslator;

import java.util.Scanner;

public class CodeGradeTranslatorVersion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		String letterGrade= "";
		char first= 'a';
		char second= 'a';
		System.out.println("What is the letter grade achieved? Please enter grade and a + or - if applicable." );
		while (running == true) {
			if (sc.hasNext()) {
				letterGrade = sc.next();
				if (letterGrade.length()>2)
					System.out.println("Please enter a valid input. example 'A+'.");
				else if (letterGrade.length()==2){
					first = letterGrade.charAt(0);
					second = letterGrade.charAt(1);
				}
					if ((first == 'A' ) || (first == 'B' ) || (first == 'C' ) || (first == 'D' ) || (first == 'F' ))
						
						if ((second == '+') || (second == '-'))
							System.out.println(first + second);
			}
			else
				System.out.println("Please enter a valid input. example 'A+'.");
				
		//System.out.println(letterGrade);
			
				
			
		
		}
	}

}
