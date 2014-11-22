
import java.util.Scanner;


public class PigLatin1{
public static void main(String args[]){

String word;
String pigWord;

Scanner sc = new Scanner(System.in);


word = sc.next();

StringBuffer sb = new StringBuffer();

int len = word.length();

for (int i = 1; i < len; i++){
	char letter = word.charAt(i);
	sb.append(letter);
	sb.append(word.charAt(0));
	sb.append("dork");
	pigWord = sb.toString();


	System.out.println(pigWord);


}










}
}