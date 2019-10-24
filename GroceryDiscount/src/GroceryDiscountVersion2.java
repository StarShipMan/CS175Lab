import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryDiscountVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double discount;
			System.out.println("Enter grocery amount, any other response to end");
			while (in.hasNextDouble())
			{
				double costGroceries = in.nextDouble();
				if (costGroceries >= 10 && costGroceries <=1000) {
					if (costGroceries <= 60) {
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
				else
					System.out.println("Please enter a number between 10 and 1000");
					System.out.println("Enter amount");
					}
				}
			}