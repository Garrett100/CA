/**
ClassName.java -- short description of the class
@author <Name>
studentID <ID>
@data file creation date
*/

import java.util.Scanner;

public class GameApp{
	public static void main(String args[]){

		String paper, rock, scissors;
		String select;

		Scanner sc = new Scanner(System.in);

		paper = ("next try");

		System.out.println("Welcome to Paper, Rock, Scissors Game!");
		System.out.println("Please enter one of the following: Paper, Rock, Scissors");

		select = sc.next();

		System.out.println("Computer chooses: ");


		if(paper.equals("next try")){

		int rand = (int) (Math.random ()* 3);
		System.out.println(rand);

		}



	}

}