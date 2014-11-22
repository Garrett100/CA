import java.util.Scanner;

public class StudentsUnionApp {
public static void main(String args[]){

	int caps, hoodies, tshirts;
	double totalCost;

char response = 'y';

	Scanner keyboard;
	StudentsUnion myStudentsUnion;


	keyboard = new Scanner(System.in);
	myStudentsUnion = new StudentsUnion();


do{
		System.out.println("Please enter how many");
		caps = keyboard.nextInt();
		myStudentUnion.setCaps(caps);

		System.out.println("Please enter how many");
		hoodies = keyboard.nextInt();
		myStudentUnion.setHoodies(hoodies);

		System.out.println("Please enter how many");
		tshirts = keyboard.nextInt();
		myStudentUnion.setTshirt(tshirts);


		myStudentUnion.compute();
		totalCost = myStudentUnion.getTotalCost();

		System.out.println("The cost of " +hoodies+ "hoodies and caps " +caps+ "and tshirts " +tshirts+ "is " +totalCost+);
		System.out.println("Would you like to continue shopping?" );

	}while (resp == 'y');
	}
}




