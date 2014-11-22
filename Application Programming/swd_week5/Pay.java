public class Pay{

	private double basicRate;
	private double basicHours;
	private double overtimeHours;
	private double basicPay;
	private double overtimePay;
	private double totalPay;


	public Pay(){
		this.basicRate = 0;
		this.basicHours = 0;
		this.overtimeHours = 0;


	}

public void setBasicRate(double basicRate){
			this.basicRate = basicRate;


}

public void setBasicHours(double basicHours){
			this.basicHours = basicHours;


}

public void setOvertimeHours(double overtimeHours){
			this.overtimeHours = overtimeHours;


}

public double getBasicPay(){
	return basicPay;

}

public double getOvertimePay(){
	return overtimePay;

}

public double getTotalPay(){
	return totalPay;

}


public void calculatePayment(){

	basicPay = basicHours * basicRate;
	//double overtimeRate 1.5 * basicRate//

	overtimePay = overtimeHours * (1.5 * basicRate);
	totalPay = basicPay + overtimePay;
}