/** A simple calculator.
@author = adriana e chis
*/

class CalculatorS{
	double result; //instance variable/ field

	public void add(double firstNumber, double secondNumber){
		result = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);
	}

	public void subtract(double firstNumber, double secondNumber){
		result = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber + " = " + result);
	}

	public void multiply(double firstNumber, double secondNumber){
		result = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber + " = " + result);
	}

	public void divide(double firstNumber, double secondNumber){
		result = firstNumber / secondNumber;
		System.out.println(firstNumber + " / " + secondNumber + " = " + result);
	}
}

