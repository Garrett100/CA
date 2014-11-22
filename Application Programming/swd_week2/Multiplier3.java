
import java.util.Scanner;

public class Multiplier3 {
public static void main(String args[]){


String name;
int age;

Scanner sc = new Scanner(System.in);

System.out.println("Please enter your name: ");

name = sc.nextLine();

System.out.println("Please enter your age: ");

age = sc.nextInt();

System.out.println("Hello"+ name + "you are" + age + "years old");


}
}