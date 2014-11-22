
import java.util.Scanner;


public class Stuff{
public static void main(String args[]){


int num;

Scanner sc = new Scanner(System.in);

System.out.println("Is the number over or under 21?");
num = sc.nextInt();


if(num < 21) {
System.out.println("Under 21");
}
else if (num == 21) {
System.out.println("Equals 21");
}
else{
System.out.println("Over 21");
}

}
}
