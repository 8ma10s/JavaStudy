package practice0504.CalcArea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate Scanner
		Scanner inScan = new java.util.Scanner(System.in);
		
		//Ask if circle or Triangle
		System.out.println("Which shape would you like to use to calculate the area? (Circle or Triangle)");
		String shape = inScan.nextLine();
		
		double result;
		
		//Triangle
		if (shape.equals("Triangle")){
			System.out.println("Enter the length of the base (in cm)");
			double base = inScan.nextDouble();
			System.out.println("Enter the height (in cm)");
			double height = inScan.nextDouble();
			
			result = calcTriangleArea(base, height);
		}
		//Circle
		else{
			shape = "Circle";
			System.out.println("Enter the length of the radius(in cm)");
			double radius = inScan.nextDouble();
			
			result = calcCircleArea(radius);
		}
		
		//output the resulting area
		System.out.println("The area of the " + shape + " is " + result + " square cm.");
		
		//close inScan
		inScan.close();
	}

	public static double calcTriangleArea(double base, double height){
		return 0.5 * base * height;
	}
	
	public static double calcCircleArea(double radius){
		return radius * radius * Math.PI;
	}
}
