import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double discount;
		boolean running = true;
		while (running == true) {
			System.out.print("Please enter the cost of your groceries or enter '0' to quit: ");
			double costGroceries = in.nextDouble();
			if (costGroceries == 0)
				running = false;
			
			else if (costGroceries < 10) {
				discount = costGroceries * 0;
				System.out.println("You are not eligible for a coupon at this time.");
				System.out.println();
			}
			
			else if (costGroceries <= 60) {
				discount = costGroceries * .08;
				System.out.println("You win a discount coupion of $" + df.format(discount) + ". (8% of your purchase)");
				System.out.println();
			}
			
			else if (costGroceries <= 150) {
				discount = costGroceries * .1;
				System.out.println("You win a discount coupion of $" + df.format(discount) + ". (10% of your purchase)");
				System.out.println();
			}
			
			else if (costGroceries <= 210) {
				discount = costGroceries * .12;
				System.out.println("You win a discount coupion of $" + df.format(discount) + ". (12% of your purchase)");
				System.out.println();
			}
			else {
				discount = costGroceries * .14;
				System.out.println("You win a discount coupion of $" + df.format(discount) + ". (14% of your purchase)");
				System.out.println();
				
			}
		}
	}

}
