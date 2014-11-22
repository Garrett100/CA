import.java.util.Scanner;

public class CalculatorAppIfDemo{

public static void main(String args[]){

double number1, number2;
char operation;

Scanner scan;
SimpleCalculator calculator;

scan = new Scanner(System.in);
calculator = new SimpleCalculator();

System.out.println("enter operation");
System.out.println("addition: enter +");
System.out.println("subtract: enter -");
System.out.println("multiply: enter *");
System.out.println("division: enter /");
String word = scan.next();
operation = word.charAt(0);

System.out.println("enter first number");
number1 = scan.nextDouble();

System.out.println("enter second number");
number2 = scan.nextDouble();
calculator.setFirstNumber(number1);
calculator.setSecondNumber(number2);

double result;
if (operation == '+') {

result = calculator.add();
System.out.println(result);

}
else if (operation == '-')  {

result = calculator.subtract();
System.out.println(result);

}

else if (operation == '*')  {

result = calculator.multiply();
System.out.println(result);

}


else if (operation == '/')  {

result = calculator.divide();
System.out.println(result);

}

else {


System.out.println("operation unknown");




}






}



}