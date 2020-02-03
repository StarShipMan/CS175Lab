import java.util.Scanner; // Imports scanner object to allow for user input
import java.text.DecimalFormat; // Imports Decimal Format object to allow rounding to desired decimal places

public class PaintCost {

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost of painting a house
		 */
		//Variables
		int houseLengthFeet;
		int houseLengthInch;
		double totalHouseLength;
		int houseWidthFeet;
		int houseWidthInch;
		double totalHouseWidth;
		int houseHeightFeet;
		int  houseHeightInch;
		double totalHouseHeight;
		int windowLengthFeet;
		int windowLengthInch;
		double totalWindowLength;
		int windowWidthFeet;
		int windowWidthInch;
		double totalWindowWidth;
		int doorLengthFeet;
		int doorLengthInch;
		double totalDoorLength;
		int doorWidthFeet;
		int doorWidthInch;
		double totalDoorWidth;
		int numberOfWindows;
		int numberOfDoors;
		double totalSqFt;
		double cost;
		double totalCost;
		
		DecimalFormat df = new DecimalFormat("0.00");
		// Rounds decimal figures to 2 decimal place
		
		Scanner in = new Scanner(System.in);
		// Creates scanner variable to store user input
		
		System.out.print("What is the length of the house in feet? ");
		houseLengthFeet = in.nextInt();
		System.out.println(houseLengthFeet + " Feet");
		System.out.print("How many remainder of inches? ");
		houseLengthInch = in.nextInt();
		System.out.println(houseLengthInch + " Inches");
		totalHouseLength = (houseLengthFeet + (double)houseLengthInch/12);
		System.out.println(df.format(totalHouseLength) + " Total Length in feet");
		// Asks for and stores length of house
		
		System.out.print("What is the width of the house in feet? ");
		houseWidthFeet = in.nextInt();
		System.out.println(houseWidthFeet + " Feet");
		System.out.print("How many remainder of inches? ");
		houseWidthInch = in.nextInt();
		System.out.println(houseWidthInch + " Inches");
		totalHouseWidth = (houseWidthFeet + (double)houseWidthInch/12);
		System.out.println(df.format(totalHouseWidth) + " Total width in feet");
		//Asks for and stores width of house
		
		System.out.print("What is the height of the house in feet? ");
		houseHeightFeet = in.nextInt();
		System.out.println(houseHeightFeet + " Feet");
		System.out.print("How many remainder of inches? ");
		houseHeightInch = in.nextInt();
		System.out.println(houseHeightInch + " Inches");
		totalHouseHeight = (houseHeightFeet + (double)houseHeightInch/12);
		System.out.println(df.format(totalHouseHeight) + " Total height in Feet");
		//Asks for and stores height of house
		
		System.out.print("How many windows does the house have?");
		numberOfWindows = in.nextInt();
		System.out.println(numberOfWindows + " windows");
		//Asks for and stores number of windows
		
		System.out.print("What is the length of a window in feet? ");
		windowLengthFeet = in.nextInt();
		System.out.println(windowLengthFeet + " Feet");
		System.out.print("How many remainder of inches? ");
		windowLengthInch = in.nextInt();
		System.out.println(windowLengthInch + " Inches");
		totalWindowLength = (windowLengthFeet + (double)windowLengthInch/12);
		System.out.println(df.format(totalWindowLength) + " Total length in feet");
		//Asks for and stores length of a window
		
		System.out.print("What is the width of a window in feet? ");
		windowWidthFeet = in.nextInt();
		System.out.println(windowWidthFeet + " Feet");
		System.out.print("How many remainder of inches? ");
		windowWidthInch = in.nextInt();
		System.out.println(windowWidthInch + " Inches");
		totalWindowWidth = (windowWidthFeet + (double)windowWidthInch/12);
		System.out.println(df.format(totalWindowWidth) + " Total length in feet");
		//Asks for and stores width of a window
		
		System.out.print("How many doors does the house have?");
		numberOfDoors = in.nextInt();
		System.out.println(numberOfDoors + " doors");
		//Asks for and stores number of doors
		
		System.out.print("What is the length of a door in feet? ");
		doorLengthFeet = in.nextInt();
		System.out.println(doorLengthFeet + " Feet");
		System.out.print("How many remainder of inches? ");
		doorLengthInch = in.nextInt();
		System.out.println(doorLengthInch + " Inches");
		totalDoorLength = (doorLengthFeet + (double)doorLengthInch/12);
		System.out.println(df.format(totalDoorLength) + " Total length in feet");
		//Asks for and stores length of a door
		
		System.out.print("What is the width of a door in feet? ");
		doorWidthFeet = in.nextInt();
		System.out.println(doorWidthFeet + " Feet");
		System.out.print("How many remainder of inches? ");
		doorWidthInch = in.nextInt();
		System.out.println(doorWidthInch + " Inches");
		totalDoorWidth = (doorWidthFeet + (double)doorWidthInch/12);
		System.out.println(df.format(totalDoorWidth) + " Total length in feet");
		//Asks for and stores length of a door
		
		System.out.print("What is the cost of the paint job per square foot? ");
		cost = in.nextInt();
		System.out.println("$" + df.format(cost) + " per square foot for the paint job.");
		//Asks for and stores the cost of the paint job.
		
		totalSqFt = 4*( totalHouseLength * totalHouseWidth) + ((totalHouseHeight-totalHouseWidth) * totalHouseLength) 
				- ((numberOfWindows)*(totalWindowLength * totalWindowWidth) + ((numberOfDoors) * (totalDoorLength * totalDoorWidth)));
		//Calculates the square foot of the area which will be painted
		
		totalCost = cost * totalSqFt;
		// Calculates total cost of paint job
		System.out.println();
		System.out.println("The total cost of the paint job will be $" + df.format(totalCost) + " for the " + totalSqFt + " that will to be painted.");
		in.close();
	}
	

}
