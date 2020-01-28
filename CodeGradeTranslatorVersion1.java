package CodeGradeTranslator;

import java.util.Scanner;

public class CodeGradeTranslatorVersion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		String letterGrade= "";
		double gradePointAverage = 0;
		System.out.println("Enter letter grade or Q to quit the program:" );
		while (isRunning == true) {
			letterGrade = sc.next();
			if ((letterGrade.equals("A+")) || (letterGrade.equals("A"))) {
				gradePointAverage = 4.0;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if A+
			else if (letterGrade.equals("A-")) {
				gradePointAverage = 3.7;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if A-
			else if (letterGrade.equals("B+")) {
				gradePointAverage = 3.3;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if B+
			else if (letterGrade.equals("B")) {
				gradePointAverage = 3.0;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if B
			else if (letterGrade.equals("B-")) {
				gradePointAverage = 2.7;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if B-
			else if (letterGrade.equals("C+")) {
				gradePointAverage = 2.3;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if C+
			else if (letterGrade.equals("C")) {
				gradePointAverage = 2.0;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if C
			else if (letterGrade.equals("C-")) {
				gradePointAverage = 1.7;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if C-
			else if (letterGrade.equals("D+")) {
				gradePointAverage = 1.3;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if D+
			else if (letterGrade.equals("D")) {
				gradePointAverage = 1.0;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if D
			else if (letterGrade.equals("D-")) {
				gradePointAverage = .7;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if D-
			else if (letterGrade.equals("F")) {
				gradePointAverage = 0;
				System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if F
			else if (letterGrade.equals("Q")) {
				System.out.println("Thank you. Come Again.");
				isRunning = false;
			}//if Q
			else 
				System.out.println("Please enter valid input. Example: A+");
			
		}//while
	}//main
}//class
		
					