/**
GuessApp.java uses the instantiable class Guess.java
*/
import java.util.Scanner;
public class GuessApp3{
	public static void main(String args[]){
		int guess;
		String ans;

		Guess ownGuess;
		ownGuess = new Guess();

Scanner sc = new Scanner(System.in);


for (int i = 0; i < 3; i++){


do{
		System.out.println("guess a number: ");
		guess = sc.nextInt();
		ownGuess.setGuess(guess);
		ownGuess.compute();


		String message = ownGuess.getMessage();

		System.out.println(message);
		System.out.println("guess again (yes)?");
		ans = sc.next();


		}while (ans.equals("yes"));


		int secret = ownGuess.getSecret();
		System.out.println("the secret number is " + secret);

}

	}

}
