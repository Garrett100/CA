/** CalculatorAppIfDemo.java -- nested if ... else selection statements demo.
The CalculatorAppIfDemo tasks:
	-- prompts the user to
		--- specify the operation to be perfomed (e.g. addition, subtraction, multiplication, division)
		--- specify the two numbers
	-- uses the instantiable class SimpleCalculator.java to delegate the actual arithmetic computation (i.e. the simpleCalculator performs the arithmetic computation)
	-- uses the nested if... else selection statements to decide what arithmetic operation to be performed based on the input received from the user
	-- displays the result

@author adriana e chis & the students of the HDSMT
*/

import java.util.Scanner;

public class CalculatorAppSwitchDemo {
	public static void main(String args[]) {

		// declare 2 variables of type double
		double number1, number2;
		// declare a char variable to store the arithmetic operation to be performed (as specified by the user)
		char operation;

		// declare variables to be able to work with a Scanner object and a SimpleCalculator object
		Scanner scan;
		SimpleCalculator calculator;

		// create the objects
		scan = new Scanner(System.in);
		// create an object of type SimpleCalculator using the constructor without any parameters
		// that means the instance variables of the calculator object are initialized with their default values (i.e. 0.0)
		calculator = new SimpleCalculator();

		// prompt the user to specify what operation to be performed
		System.out.println("enter operation");
		System.out.println("addition: enter +");
		System.out.println("subtraction: enter -");
		System.out.println("multiplication: enter *");
		System.out.println("division: enter /");
		String word = scan.next(); // return the next token (i.e. word) from the keyboard as String, and save it in the variable word. e.g. "+"
		operation = word.charAt(0); // retrieve the first character from the String word e.g. '+'.
		/* side note: in the String literal "Adam"
		"Adam".charAt(0) returns 'A'
		"Adam".charAt(1) returns 'd'
		"Adam".charAt(2) returns 'a'
		"Adam".charAt(3) returns 'm'
		*/

		// prompt the user to provide the two numbers
		System.out.println("enter first number");
		number1 = scan.nextDouble();
		System.out.println("enter second number");
		number2 = scan.nextDouble();

		// above we created a new object of type SimpleCalculator with its default values (i.e. 0.0 and 0.0) because we did not provide any values to the constructor
		// therefore, we need to use the setter methods to assign the two values (provided by the user) to the calculator object's instance variables
		calculator.setFirstNumber(number1);
		calculator.setSecondNumber(number2);

		/*
		// alternative to the object creation:
		// the next object creation statement using the constructor with parameters (line 64) is equivalent (i.e. produces the same result) with the above object creation using the constructor without parameters (line 31) and then setting the instance variables by using their corresponding setter methods (lines 56 and 57)
		// create the object calculator providing the numbers given by the user
		// the calculator object's instance variables are assigned the 2 values provided by the user
	        calculator = new SimpleCalculator(number1, number2);
		*/

		// declare a double variable to store the result of the arithmetic computation
		double result;
		switch (operation){
			case '+':
			result = calculator.add();
			System.out.println(result);
			break;

			case '-':
			result = calculator.subtract();
			System.out.println(result);
			break;

			case '*':
			result = calculator.multiply();
			System.out.println(result);
			break;

			case '/':
			result = calculator.divide();
			System.out.println(result);
			break;

			default:
			System.out.println("unknown operation");
			break;
}
}
}
