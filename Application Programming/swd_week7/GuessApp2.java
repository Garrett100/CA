/**
GuessApp.java uses the instantiable class Guess.java
*/
import java.util.Scanner;
public class GuessApp2{
	public static void main(String args[]){
		int guess;

		Guess ownGuess;
		ownGuess = new Guess();
int n;
Scanner sc = new Scanner(System.in);
System.out.println("how many times you want to guess");
n = sc.nextInt();

for (int i = 0; i < 3; i++){


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
