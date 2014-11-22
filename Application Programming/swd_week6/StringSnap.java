import java.util.Scanner;



public class StringSnap{
public static void main (String args[]){

String text1, text2;
Scanner sc;
sc = new Scanner(System.in);

System.out.println("enter first word");
text1 = sc.next();
System.out.println("enter second word");
text2 = sc.next();

if (text1.equalsIgnoreCase(text2)) {

System.out.println("SNAP");

}
else  {

System.out.println("different word");

}





}
}