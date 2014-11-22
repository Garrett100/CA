/** The program computes a circle's area given its radius.
@author adriana e chis
*/

import java.util.Scanner;

public class Circle {

	final double PI = 3.14;
	double area;
	//double radius;

	public void computeArea(double radius){
		area = PI * radius * radius;
		System.out.println(area);

	}

	public static void main(String[] args){
		// a constant of type double

		// declare two variables of type double called radius and area
		double radius;

		// create an object of type Scanner to accept user's input from the keyboard
		Scanner sc = new Scanner(System.in);

		// prompt the user to input the radius of the circle
		System.out.println("Enter circle's radius: ");
		radius = sc.nextDouble();

		Circle circle = new Circle();
		// compute the area of the circle
		circle.computeArea(radius);


	}
}

