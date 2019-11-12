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
		int creditHours = 0;
		double gradePointAverage = 0;
		int gradePoint = 0;
		int totalCreditHours = 0;
		double totalGradePoints = 0;
		ArrayList<String> courseInfoArray= new ArrayList <String>();
		ArrayList<String> courseInfoArraySplit = new ArrayList<String>();
		String courseInfo= "";
		System.out.println("Enter course information or 'End' to quit the program:" );
	
		
		while (isRunning == true) {
			System.out.println("Enter name of course:");
			course = sc.next();
			//System.out.println("course name is "+ course + ".");
			if (course.equals("End"))
				break;
			System.out.println("Enter credit hours of course:");
			creditHours = sc.nextInt();
			totalCreditHours = totalCreditHours + creditHours;
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
			else if ((letterGrade.equals("F")) ||(letterGrade.contentEquals("W"))) {
				gradePointAverage = 0;
				//System.out.println("The grade point average is " + gradePointAverage + ".");
			}//if F
			else 
				System.out.println("Please enter valid input. Example: A+"); 
			totalGradePoints = totalGradePoints + gradePointAverage;
			courseInfo = course + "," + creditHours + "," + letterGrade + ", " + gradePointAverage;
			courseInfoArray.add(courseInfo);
			
		}//while
		System.out.println("Course : Credit Hours  : Grade :  Grade Points");
		String index = "";
		String [] indexSplit;
		String stringGradePointAverage = "";
		String stringCreditHours;
		while (counter < courseInfoArray.size()) {
			 index =  courseInfoArray.get(counter);
			 indexSplit = index.split(",");
			 //System.out.println(index);
			 course = indexSplit[0];
			 stringCreditHours = indexSplit[1];
			 letterGrade = indexSplit[2];
			 stringGradePointAverage = indexSplit[3];
			 System.out.println(course + ":" + stringCreditHours + ":" + letterGrade + ":" + stringGradePointAverage );
			 counter++;
		}//while
		System.out.println(totalCreditHours + " Total Credit Hours Attempted. " + totalGradePoints + " Total Grade Points");
		System.out.println();
		System.out.println("GPA = "+ totalGradePoints + "/" + totalCreditHours + " = " + (totalGradePoints/totalCreditHours));
		
	}//main
}//class
		