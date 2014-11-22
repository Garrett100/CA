/**
Generate a secret number. An user of the instantiable class Guess should guess he number.
*/

public class Guess {
	private int guess;
	private int secret;
	private String message;

	public Guess() {
		secret = (int)(Math.random()*10) + 1;
		message = "you did not guess yet";
	}

	public void setGuess(int guess){
		this.guess = guess;
	}

	public int getSecret(){
		return secret;
	}

	public String getMessage(){
		return message;
	}

	public void compute(){
		if (guess == secret) {
			message = "congratulations!";
		} else if (guess > secret){
			message = "guessed too high.";	
		} else{
			message = "guessed too low.";
		}
	}
}
