package chapter5;

import java.util.Scanner;

public class E52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		boolean running = true;
		double x = 0;
		double Epsilon = .0000001;
		String negZeroPosSmall = "";
		
			System.out.println("Input an integer and I will print whether it is negative, positive, or zero. Enter 666 to exit");
			x = in.nextDouble();
			if (Math.abs(x)<1) {
				if (x<0)
					negZeroPosSmall = "small negative number.";
				else if  (x==0) 
					negZeroPosSmall = "zero.";
				else if (x > 0)
					negZeroPosSmall ="small positive number.";
			}
			else if(Math.abs(x)>1000000) {
				if (x<0)
					negZeroPosSmall = "large negative number.";
				else if (x > 0)
					negZeroPosSmall = "large positive number.";
			}
			else {
				if (x<0)
					negZeroPosSmall = "negative number.";
				else if  (x==0) 
					negZeroPosSmall = "zero.";
				else if (x > 0)
					negZeroPosSmall ="positive number.";
			}
			System.out.println(x + " is a " + negZeroPosSmall);			
	}//main

}//E52 class
