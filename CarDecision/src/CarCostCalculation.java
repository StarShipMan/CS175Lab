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
		byte yearsDriven;
		int counter;
		float yearlyCostRegularCar;
		float yearlyCostHybridCar;
		float totalCostAfterYearsDrivenRegularCar;
		float totalCostAfterYearsDrivenHybridCar;
		
		DecimalFormat df = new DecimalFormat("0.00");
		// Rounds decimal figures to 2 decimal place
		
		Scanner in = new Scanner(System.in);
		// Creates scanner variable to store user input
		
		System.out.print("What is the cost of the regular car? ");
		costRegularCar = in.nextFloat();
		System.out.println("The regular car costs $" + df.format(costRegularCar));
		System.out.println();
		System.out.print("How many miles per gallon does the regular car get? ");
		milesPerGallonRegularCar = in.nextByte();
		System.out.println("The regular car gets " + milesPerGallonRegularCar + " miles to the gallon.");
		// Asks for cost and miles per gallon of regular car and stores values into variables
		
		System.out.println();
		System.out.print("what is the cost of the hybrid car? ");
		costHybridCar = in.nextFloat();
		System.out.println("The hybrid car costs $" + df.format(costHybridCar));
		System.out.println();
		System.out.print("How many miles per gallon does the hybrid car get? ");
		milesPerGallonHybridCar = in.nextByte();
		System.out.println("The hybrid car gets " + milesPerGallonHybridCar + " miles to the gallon.");
		//Asks for the cost and miles per gallon of the hybrid car and stores values as variables
		
		System.out.println();
		System.out.print("How many miles will you be driving in a year? ");
		drivenMilesPerYear = in.nextInt();
		System.out.println(drivenMilesPerYear + " miles will be driven in a year.");
		//asks for and stores the miles driven in a year as a variable
		
		System.out.println();
		System.out.print("What is the cost of gas per gallon? ");
		costPerGallon = in.nextFloat();
		System.out.println("The cost of a gallon of gas is " + df.format(costPerGallon));
		//Asks for and stores the cost of gas as a variable
		
		System.out.println();
		System.out.print("How many years will the cars potentially be driven for? ");
		yearsDriven = in.nextByte();
		System.out.println("The cars will be driven for " + yearsDriven + " years.");
		//Asks for and stores the years driven as a variable
		
		
		yearlyCostRegularCar = drivenMilesPerYear / milesPerGallonRegularCar * costPerGallon ;
		yearlyCostHybridCar = drivenMilesPerYear / milesPerGallonHybridCar * costPerGallon;
		System.out.println();
		System.out.println("The cost of gas for each year for the regular car is $" + df.format(yearlyCostRegularCar));
		System.out.println("The cost of gas for each year for the hybrid car is $" + df.format(yearlyCostHybridCar));
		//Calculates the cost of gas for  the regular car per year
		
		counter = 0;
		System.out.println();
		while (counter < yearsDriven) {
			if ((counter) + 1 == 1) {
				System.out.println("Cost to own the regular car after " + (counter + 1) + " year is $" + df.format((costRegularCar + (counter + 1)*yearlyCostRegularCar)) + ".");
				System.out.println("Cost to own the hybrid car after " + (counter + 1) + " year is $" + df.format((costHybridCar + (counter + 1)*yearlyCostHybridCar)) + ".");
				counter = counter + 1;}
			else {
				System.out.println();
				System.out.println("Cost to own the regular car after " + (counter + 1) + " years is $" + df.format((costRegularCar + (counter + 1)*yearlyCostRegularCar)) + ".");
				System.out.println("Cost to own the hybrid car after " + (counter + 1) + " years is $" + df.format((costHybridCar + (counter + 1)*yearlyCostHybridCar)) + ".");
				counter = counter + 1;}
		}
		
		totalCostAfterYearsDrivenRegularCar = costRegularCar + yearsDriven * yearlyCostRegularCar;
		totalCostAfterYearsDrivenHybridCar = costHybridCar + yearsDriven * yearlyCostHybridCar;
		if (yearsDriven == 1) {
			
			if (totalCostAfterYearsDrivenRegularCar<totalCostAfterYearsDrivenHybridCar) {
				System.out.println("The regular car costs less after " + yearsDriven + " year.");
			}
			else if (totalCostAfterYearsDrivenRegularCar==totalCostAfterYearsDrivenHybridCar) {
				System.out.println("Both cars cost the same after " + yearsDriven + " year.");
			}
			else  {
				System.out.println("The hybrid car costs less after " + yearsDriven + " year.");
			}
		}
		else {
			if (totalCostAfterYearsDrivenRegularCar<totalCostAfterYearsDrivenHybridCar) {
				System.out.println("The regular car costs less after " + yearsDriven + " years.");
			}
			else if (totalCostAfterYearsDrivenRegularCar==totalCostAfterYearsDrivenHybridCar) {
				System.out.println("Both cars cost the same after " + yearsDriven + " years.");
			}
			else  {
				System.out.println("The hybrid car costs less after " + yearsDriven + " years.");
			}
		}
	}
}
