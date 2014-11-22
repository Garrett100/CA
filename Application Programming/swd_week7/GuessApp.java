/**
GuessApp.java uses the instantiable class Guess.java
*/
import java.util.Scanner;
public class GuessApp{
	public static void main(String args[]){
		int guess;

		Guess ownGuess;
		ownGuess = new Guess();

for (int i = 0; i < 3; i++){

		Scanner sc = new Scanner(System.in);
		System.out.println("guess a number: ");
		guess = sc.nextInt();
		ownGuess.setGuess(guess);
		ownGuess.compute();


		String message = ownGuess.getMessage();

		System.out.println(message);
		}
		int secret = ownGuess.getSecret();
		System.out.println("the secret number is " + secret);



	}

}
