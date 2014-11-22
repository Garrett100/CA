
import java.util.Scanner;


public class AverageApp{
public static void main(String args[]){

int numbers[];

numbers = new int [5];

Scanner sc = new Scanner(System.in);


for (int i = 0; i < 5; i++){

	System.out.println("Enter a number: ");

numbers[i] = sc.nextInt();

}
int sum = 0;
double avg;

for (int i = 0; i < numbers.length; i++){

sum = sum + numbers[i];

}
avg = (double)sum/numbers.length;


	System.out.println("Average: " + avg);




}

}