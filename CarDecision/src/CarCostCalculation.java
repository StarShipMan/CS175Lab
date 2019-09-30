import java.text.DecimalFormat;
import java.util.Scanner; // Imports scanner object to allow for user input

public class CarCostCalculation {

	public static void main(String[] args) {
		/*
		 * This program will calculate costs of two different cars, 
		 * print their costs per year over five years,
		 * and determine which car would cost more over five years.
		 */
		
		// Needed Variables
		float costRegularCar;
		float costHybridCar;
		byte milesPerGallonRegularCar;
		byte milesPerGallonHybridCar;
		int drivenMilesPerYear;
		float costPerGallon;
		int yearsDriven;
		int counter;
		
		DecimalFormat df = new DecimalFormat("0.00");
		// Rounds decimal figures to 2 decimal place
		
		Scanner in = new Scanner(System.in);
		// Creates scanner variable to store user input
		
		System.out.print("What is the cost of the regular car?");
		costRegularCar = in.nextFloat();
		System.out.println("The regular car costs " + costRegularCar);
		System.out.print("How many miles per gallon does th regular car get?");
		
	}

}
