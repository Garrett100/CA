

import java.util.Scanner;

public class PayApp2{

public static void main(String args[]) {
//declare local variables//
double basicRate, basicHours, overtimeHours;

//delare a scanner object//

Scanner sc;

//create scanner//
sc = new Scanner(System.in);
	System.out.println("enter basic rate");
	basicRate = sc.nextDouble();

	System.out.println("enter number of basic hours");
	basicHours = sc.nextDouble();

	System.out.println("enter number of overtime hours");
	overtimeHours = sc.nextDouble();
//decalre pay//
Pay pay = new Pay();
//set the basic rate//
pay.setBasicRate(basicRate);
pay.setBasicHours(basicHours);
pay.setOvertimeHours(overtimeHours);

pay.calculatePayment();
pay.getBasicPay();

double basicPay1 = pay.getBasicPay();
	System.out.println("basic pay:" + basicPay1);

double overtimePay1 = pay.getOvertimePay();
	System.out.println("overtime pay:" + overtimePay1);

double totalPay1 = pay.getTotalPay();
	System.out.println("total pay:" + totalPay1);









}
