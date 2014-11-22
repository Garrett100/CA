
import java.util.Scanner;


public class Reverse{
public static void main(String args[]){

String word;

System.out.println("Enter a new word");
Scanner sc = new Scanner(System.in);

word = sc.next();
int len = word.length();
for (int i = len-1; i >= 0; i--){
	System.out.println(word.charAt(i));



}



}

}