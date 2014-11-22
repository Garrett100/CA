/** Simple calculator class demonstrates how to define an instantiable class.
The class shows:
	-- how to declare instance variables/ fields;
	-- how to declare multiple constructors;
	-- how to create setter and getter methods corresponding to the instance variables;
	-- how to declare a method to return a value

@author adriana e chis
*/

class SimpleCalculator{
	
	private double firstNumber; //declare an instance variable/ field
	private double secondNumber; //declare an instance variable/ field

	// declare a constructor with 2 parameters
	public SimpleCalculator(double firstNumber, double secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	// declare a constructor without any parameters (we must declare this constructor only if we want to allow the creation of objects with the instance variables' default values)
	public SimpleCalculator(){
	}
	

	// method to add two numbers
	// the method returns the result of the addition
	public double add(){
		double sum; // local variable -- variable scope: the variable can be used only within the methd add() (i.e. it is not recognized outside of this method)
		sum = firstNumber + secondNumber;
		return sum;
	}


	// method to subtract two numbers
	// the method returns the result of the subtraction
	public double subtract(){
		double difference; // local variable -- variable scope: the variable can be used only within the methd subtract() (i.e. it is not recognized outside of this method)
		difference = firstNumber - secondNumber;
		return difference;
	}


	// method to multiply two numbers
	// the method returns the result of the multiplication
	public double multiply(){
		double product; // local variable -- variable scope: the variable can be used only within the methd multiply() (i.e. it is not recognized outside of this method)
		product = firstNumber * secondNumber;
		return product;
	}
	

	// method to divide two numbers
	// the method returns the result of the division
	public double divide(){
		double quotient; // local variable -- variable scope: the variable can be used only within the methd divide() (i.e. it is not recognized outside of this method)
		quotient = firstNumber / secondNumber;
		return quotient;
	}


	// setter method to set the value of the first number
	public void setFirstNumber(double number){
		firstNumber = number;
	}

	// getter method to get/retrive the value of the firstNumber
	public double getFirstNumber(){
		return firstNumber;
	}


	// setter method to set the value of the second number
	public void setSecondNumber(double number){
		secondNumber = number;
	}

	// getter method to get/retrive the value of the firstNumber
	public double getSecondNumber(){
		return secondNumber;
	}

}
