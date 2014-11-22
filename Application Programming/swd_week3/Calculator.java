/** A simple calculator.
@author adriana e chis
*/

public class Calculator{
	// the state of the calculator
	int result;
	boolean ready;
	boolean isScientific;
	
	public void clear(){
	//reset the result of the calculator
	result=0;
	}

	public void add(int firstNumber, int secondNumber){
		result = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);
	}

	public void subtract(int firstNumber, int secondNumber){
		result = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber + " = " + result);
	}

	public void multiply(int firstNumber, int secondNumber){
		result = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber + " = " + result);
	}

	public void divide(int firstNumber, int secondNumber){
		result = firstNumber / secondNumber;
		System.out.println(firstNumber + " / " + secondNumber + " = " + result);
	}

	public static void main(String[] args){
		int a,b;

		// assign values to variables
		a = 12;
		b = 3;

		//create an object of type Calculator
		Calculator calc = new Calculator();

		// now we can start using the methods of the object named calc whose data type is Calculator
		// instruct the object calc to perform an addition (i.e. call/invoke the method add() on the object calc)
		calc.add(a, b);
		// instruct the object calc to perform a subtraction (i.e. call/invoke the method subtract() on the object calc)
		calc.subtract(a, b);
		// instruct the object calc to perform a multiplication (i.e. call/invoke the method multiply() on the object calc)
		calc.multiply(a, b);
		// instruct the object calc to perform a division (i.e. call/invoke the method divide() on the object calc)
		calc.divide(a, b);
	}
}