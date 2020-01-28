package CarDecision;
import java.text.DecimalFormat;
import java.util.Scanner; // Imports scanner object to allow for user input

public class CarDecisionVersion1 {

	public static void main(String[] args) {
		/*
		 * This program will calculate costs of two different cars, 
		 * print their costs per year over five years,
		 * and determine which car would cost more over five years.
		 */
		
		// Needed Variables
		double costRegularCar;
		double costHybridCar;
		double milesPerGallonRegularCar;
		double milesPerGallonHybridCar;
		double drivenMilesPerYear;
		double costPerGallon;
		int yearsDriven = 5;
		int counter;
		double yearlyCostRegularCar;
		double yearlyCostHybridCar;
		double totalCostAfterYearsDrivenRegularCar;
		double totalCostAfterYearsDrivenHybridCar;
		
		
		DecimalFormat df = new DecimalFormat("0.00");
		// Rounds decimal figures to 2 decimal place
		
		Scanner in = new Scanner(System.in);
		// Creates scanner variable to store user input
		
		System.out.println("Enter Cost of regular car:");
		costRegularCar = in.nextDouble();
		System.out.println("Enter Miles per gallon of regular car:");
		milesPerGallonRegularCar = in.nextDouble();
		System.out.println("Enter Cost of hybrid car:");
		costHybridCar = in.nextDouble();
		System.out.println("Enter Miles per gallon of hybrid car:");
		milesPerGallonHybridCar = in.nextDouble();
		System.out.println("Enter miles traveled in a year:");
		drivenMilesPerYear = in.nextDouble();
		System.out.println("Enter cost per gallon of gas:");
		costPerGallon = in.nextDouble();
		yearlyCostRegularCar = drivenMilesPerYear / milesPerGallonRegularCar * costPerGallon ;
		yearlyCostHybridCar = drivenMilesPerYear / milesPerGallonHybridCar * costPerGallon;
		counter = 0;
		while (counter < yearsDriven) {
				System.out.println("Cost to own after year " + (counter + 1) + "  for regular car: " + df.format(costRegularCar + (counter + 1)*yearlyCostRegularCar) + " for hybrid car: " + df.format((costHybridCar) + (counter + 1)*yearlyCostHybridCar));
				//System.out.println("Cost to own " + makeHybrid + " " + modelHybrid + " after " + (counter + 1) + " year is $" + df.format((Integer.parseInt(costHybrid) + (counter + 1)*yearlyCostHybridCar)) + ".");
				counter = counter + 1;

		}
		
		totalCostAfterYearsDrivenRegularCar = costRegularCar + yearsDriven * yearlyCostRegularCar;
		totalCostAfterYearsDrivenHybridCar = costHybridCar + yearsDriven * yearlyCostHybridCar;
		if (totalCostAfterYearsDrivenRegularCar<totalCostAfterYearsDrivenHybridCar) 
				System.out.println("The regular car pays back after " + yearsDriven + " years");	
		else if (totalCostAfterYearsDrivenRegularCar==totalCostAfterYearsDrivenHybridCar) 
				System.out.println("Both cars cost the same after " + yearsDriven + " years.");
		else  
				System.out.println("The hybrid car pays back after " + yearsDriven + " years");
		}
		
	}
