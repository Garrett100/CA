/** A simple calculator app.
@author = adriana e chis
*/

import java.util.Scanner;

public class CalculatorApp{

	public static void main(String[] args){
		double number1;
		double number2;

		// create an object sc of type Scanner to allow input from the keyboard
		Scanner sc = new Scanner(System.in);

		// prompt the user to provide the first number
		System.out.println("Enter first number");
		number1 = sc.nextDouble();
		// prompt the user to provide the second number
		System.out.println("Enter second number");
		number2 = sc.nextDouble();

		//create an object of type CalculatorS
		CalculatorS calc = new CalculatorS();

		// now we can start using the methods of the object named calc whose data type is Calculator
		// instruct the object calc to perform an addition (i.e. call/invoke the method add() on the object calc)
		calc.add(number1, number2);
		// instruct the object calc to perform a subtraction (i.e. call/invoke the method subtract() on the object calc)
		calc.subtract(number1, number2);
		// instruct the object calc to perform a multiplication (i.e. call/invoke the method multiply() on the object calc)
		calc.multiply(number1, number2);
		// instruct the object calc to perform a division (i.e. call/invoke the method divide() on the object calc)
		calc.divide(number1, number2);



	}
}