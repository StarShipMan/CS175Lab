package chapter5;

import java.util.Scanner;

public class E59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double initialAngle = 0;
		double angle = initialAngle;
		double maxAngle = 360;
		String direction = "";
		
		System.out.println("What is the angle in degrees?");
		initialAngle = sc.nextDouble();
		while (angle>maxAngle)
			angle = angle - maxAngle;

		

	}

}
