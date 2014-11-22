


public class VariablesAndInstanceVariablesDemo {

public static void main(String args[]) {

	VariablesAndInstanceVariablesDemo = new VariablesAndInstanceVariablesDemo();
	demo.printMessage();
	demo.anotherMethod();

	//access a public instance variable
	demo.address = "Mayor Street";
	System.out.println(demo.address);

	//access a private instance variable
	//demo.number = 12;//
	//System.out.println(demo.number);//

	demo.setNumber(12);
int myNumber = demo.getNumber();
	System.out.println(myNumber);

}
}