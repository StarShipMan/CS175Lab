package CarDecision;
import java.text.DecimalFormat;
import java.util.Scanner; // Imports scanner object to allow for user input

public class CarDecisionVersion2 {

	public static void main(String[] args) {
		/*
		 * This program will calculate costs of two different cars, 
		 * print their costs per year over five years,
		 * and determine which car would cost more over five years.
		 */
		
		// Needed Variables
		float costRegularCar;
		float costHybridCar;
		byte milesPerGallonRegularCa;
		byte milesPerGallonHybridCar;
		double drivenMilesPerYear = 15000;
		double costPerGallon = 2.5;
		byte yearsDriven = 5;
		int counter;
		double yearlyCostRegularCar;
		double yearlyCostHybridCar;
		double totalCostAfterYearsDrivenRegularCar;
		double totalCostAfterYearsDrivenHybridCar;
		
		//This is the Stickers to obtain new Variables
		String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		String [] hybrid = stickerHybrid.split(",");
		//Hybrid Variables
		String [] makeHybridSplit = hybrid[0].split(":");
		String makeHybrid = makeHybridSplit[1];
		String [] modelHybridSplit = hybrid[1].split(":");
		String modelHybrid = modelHybridSplit[1];
		String [] costHybridSplit = hybrid[2].split(":");
		String costHybrid = costHybridSplit[1];
		String [] milesPerGallonHybridSplit = hybrid[3].split(":");
		String milesPerGallonHybrid = milesPerGallonHybridSplit[1];
		//System.out.println(makeHybrid + modelHybrid + costHybrid + milesPerGallonHybrid);
		//Regular Variables
		String [] regular = stickerRegular.split(",");
		String [] makeRegularSplit = regular[0].split(":");
		String makeRegular = makeRegularSplit[1];
		String [] modelRegularSplit = regular[1].split(":");
		String modelRegular = modelRegularSplit[1];
		String [] costRegularSplit = regular[2].split(":");
		String costRegular = costRegularSplit[1];
		String [] milesPerGallonRegularSplit = regular[3].split(":");
		String milesPerGallonRegular = milesPerGallonRegularSplit[1];
		//System.out.println(makeRegular + modelRegular + costRegular + milesPerGallonRegular);
				
		DecimalFormat df = new DecimalFormat("0.00");
		// Rounds decimal figures to 2 decimal place
		
		Scanner in = new Scanner(System.in);
		// Creates scanner variable to store user input
		
		//System.out.println("The regular car is a " + makeRegular + " " + modelRegular +  " that costs $" + costRegular + " and gets " + milesPerGallonRegular + " miles to the gallon." );
		
		//costRegularCar = in.nextFloat();
		//System.out.println("The regular car costs $" + df.format(costRegularCar));
		//System.out.print("How many miles per gallon does the regular car get? ");
		//milesPerGallonRegularCar = in.nextByte();
		//System.out.println("The regular car gets " + milesPerGallonRegularCar + " miles to the gallon.");
		// Asks for cost and miles per gallon of regular car and stores values into variables
		
		//System.out.println("The hybrid car is a " + makeHybrid + " " + modelHybrid +  " that costs $" + costHybrid + " and gets " + milesPerGallonHybrid + " miles to the gallon.");
		
		//costHybridCar = in.nextFloat();
		//System.out.println("The hybrid car costs $" + df.format(costHybridCar));
		//System.out.println();
		//System.out.print("How many miles per gallon does the hybrid car get? ");
		//milesPerGallonHybridCar = in.nextByte();
		//System.out.println("The hybrid car gets " + milesPerGallonHybridCar + " miles to the gallon.");
		//Asks for the cost and miles per gallon of the hybrid car and stores values as variables
		
		//System.out.println();
		System.out.print("How many miles will you be driving in a year? ");
		drivenMilesPerYear = in.nextInt();
		//System.out.println(drivenMilesPerYear + " miles will be driven in a year.");
		//asks for and stores the miles driven in a year as a variable
		
		//System.out.println();
		System.out.print("What is the cost of gas per gallon? ");
		costPerGallon = in.nextFloat();
		//System.out.println("The cost of a gallon of gas is $" + df.format(costPerGallon));
		//Asks for and stores the cost of gas as a variable
		
		//System.out.println();
		//System.out.print("How many years will the cars potentially be driven for? ");
		//yearsDriven = in.nextByte();
		//System.out.println("The cars will be driven for " + yearsDriven + " years.");
		//Asks for and stores the years driven as a variable
		
		
		yearlyCostRegularCar = drivenMilesPerYear / Double.parseDouble(milesPerGallonRegular) * costPerGallon ;
		yearlyCostHybridCar = drivenMilesPerYear / Double.parseDouble(milesPerGallonHybrid) * costPerGallon;
		//System.out.println();
		//System.out.println("The cost of gas for each year for the regular car is $" + df.format(yearlyCostRegularCar));
		//System.out.println("The cost of gas for each year for the hybrid car is $" + df.format(yearlyCostHybridCar));
		//Calculates the cost of gas for  the regular car per year
		
		counter = 0;
		System.out.println();
		while (counter < yearsDriven) {
			if ((counter) + 1 == 1) {
				System.out.println("Cost to own " + makeRegular + " " + modelRegular + " after " + "year " + (counter + 1) + ": "  + df.format((Integer.parseInt(costRegular) + (counter + 1)*yearlyCostRegularCar)) + " for " + makeHybrid + " " + modelHybrid + ": " + df.format((Integer.parseInt(costHybrid) + (counter + 1)*yearlyCostHybridCar)));
				//System.out.println("Cost to own " + makeHybrid + " " + modelHybrid + " after " + (counter + 1) + " year is $" + df.format((Integer.parseInt(costHybrid) + (counter + 1)*yearlyCostHybridCar)) + ".");
				counter = counter + 1;}
			else {
				//System.out.println();
				System.out.println("Cost to own " + makeRegular + " " + modelRegular + " after " + "year " + (counter + 1) + ": "  + df.format((Integer.parseInt(costRegular) + (counter + 1)*yearlyCostRegularCar)) + " for " + makeHybrid + " " + modelHybrid + ": " + df.format((Integer.parseInt(costHybrid) + (counter + 1)*yearlyCostHybridCar)));
				//System.out.println("Cost to own " + makeHybrid + " " + modelHybrid + " after " + (counter + 1) + " years is $" + df.format((Integer.parseInt(costHybrid) + (counter + 1)*yearlyCostHybridCar)) + ".");
				counter = counter + 1;}
		}
		
		totalCostAfterYearsDrivenRegularCar = Integer.parseInt(costRegular) + yearsDriven * yearlyCostRegularCar;
		totalCostAfterYearsDrivenHybridCar = Integer.parseInt(costHybrid) + yearsDriven * yearlyCostHybridCar;
		if (yearsDriven == 1) {
			
			if (totalCostAfterYearsDrivenRegularCar<totalCostAfterYearsDrivenHybridCar) {
				System.out.println("The " + makeRegular + " " + modelRegular + " costs less after " + yearsDriven + " year.");
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
				System.out.println("The " + makeHybrid + " " + modelHybrid + " pays back after " + yearsDriven + " years.");
			}
		}
	}
}
