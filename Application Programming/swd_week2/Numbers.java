/** Program Numbers.java demonstrates operations on integer and real numbers.

@author adriana e chis
*/

public class Numbers{
	public static void main(String[] args){
		// declare a variable of type double
		double da;

		// declare a variable of type double and initialize it
		double db = 12.19;

		// assign a value to the variable a
		da = 2.3;

		double dc = db/da;

		System.out.println(" db: " + db + " / da: " + da + " = dc: " + dc);
		System.out.println();

		// declare a variable of type int
		int id;
		id = 2;
		da = db + id;

		System.out.println(" db: " + db + " + id: " + id + " = da: " + da);
		System.out.println();

		//id = db/10;  //compiling error
		/* the above assignment leads to a compilation error
			Numbers.java:30: possible loss of precision
			found   : double
			required: int
		*/
		id = (int) db/10; // we force the type we want by TYPE CASTING (datatype), in this example (int)
		System.out.println(" db: " + db + " / 10 = id: " + id);
		System.out.println(" (int) db: " + (int) db + " / 10 = id: " + id);
		System.out.println();

		// id =  da; // compiling error
		id = (int) da;

		int ig = 4;
		id = id * 10;

		da = id/ig;  // integer division => the result is an integer (i.e. 2) which is going to be stored as a double (2.0) because assign the result to a double variable 

		System.out.println("integer division: id: " + id + " / ig: " + ig + " = da: " + da);
		System.out.println();

		// if we want the correct division result from maths we use type casting, in this example (double)
		da = (double) id/ig; // double division
		System.out.println("double division: id: " + id + " / ig: " + ig + " = da: " + da);
		da = id/ (double) ig; // double division
		System.out.println("double division: id: " + id + " / ig: " + ig + " = da: " + da);
		System.out.println();


		//Note make sure that you type cast one of the operands and not the result of the division
		da = (double) (id/ig); // integer division
		System.out.println("integer division: id: " + id + " / ig: " + ig + " = da: " + da);
		System.out.println();

		
		// Math class provides methods for numerical rounding operations
		db = 35.7;
		System.out.println("db: " + db);		
		dc = Math.floor(db);
		System.out.println("floor: db: " + dc);
		dc = Math.round(db);
		System.out.println("round: db: " + dc);
		dc = Math.ceil(db);
		System.out.println("ceil: db: " + dc);
		System.out.println();

		db = 35.4;
		System.out.println("db: " + db);		
		dc = Math.floor(db);
		System.out.println("floor: db: " + dc);
		dc = Math.round(db);
		System.out.println("round: db: " + dc);
		dc = Math.ceil(db);
		System.out.println("ceil: db: " + dc);

		



		
	}
}

