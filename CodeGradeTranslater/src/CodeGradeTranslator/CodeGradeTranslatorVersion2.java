package CodeGradeTranslator;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeGradeTranslatorVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		int counter = 0;
		String course = "";
		String letterGrade= "";
		String creditHours = "";
		double gradePointAverage = 0;
		int gradePoint = 0;
		ArrayList<String> courseInfoArray= new ArrayList <String>();
		String courseInfo= "";
		System.out.println("Enter course information or Q to quit the program:" );
	
		
		while (isRunning == true) {
			System.out.println("Enter name of course:");
			course = sc.next();
			//System.out.println("course name is "+ course + ".");
			if (course.equals("End"))
				break;
			System.out.println("Enter credit hours of course:");
			creditHours = sc.next();
			//System.out.println("credit hours of course is " + creditHours + ".");
			System.out.println("Enter letter grade:");
			letterGrade = sc.next();
			if ((letterGrade.equals("A+")) || (letterGrade.equals("A"))) {
				gradePointAverage = 4.0;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if A+
			else if (letterGrade.equals("A-")) {
				gradePointAverage = 3.7;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if A-
			else if (letterGrade.equals("B+")) {
				gradePointAverage = 3.3;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if B+
			else if (letterGrade.equals("B")) {
				gradePointAverage = 3.0;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if B
			else if (letterGrade.equals("B-")) {
				gradePointAverage = 2.7;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if B-
			else if (letterGrade.equals("C+")) {
				gradePointAverage = 2.3;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if C+
			else if (letterGrade.equals("C")) {
				gradePointAverage = 2.0;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if C
			else if (letterGrade.equals("C-")) {
				gradePointAverage = 1.7;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if C-
			else if (letterGrade.equals("D+")) {
				gradePointAverage = 1.3;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if D+
			else if (letterGrade.equals("D")) {
				gradePointAverage = 1.0;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if D
			else if (letterGrade.equals("D-")) {
				gradePointAverage = .7;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if D-
			else if (letterGrade.equals("F")) {
				gradePointAverage = 0;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if F
			else 
				System.out.println("Please enter valid input. Example: A+");
			courseInfo = course + "," + creditHours + "," + gradePointAverage;
			courseInfoArray.add(courseInfo);
			
		}//while
			System.out.println(courseInfoArray);

	}//main
}//class
		