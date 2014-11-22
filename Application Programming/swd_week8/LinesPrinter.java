
import java.util.Scanner;


public class LinesPrinter{
public static void main(String args[]){

String word;

System.out.println("Enter a new word");
Scanner sc = new Scanner(System.in);

word = sc.next();

int len = word.length();
for (int i = 0; i < len; i++ ){

	char letter = word.charAt(i);
	System.out.println(letter);





}



}

}