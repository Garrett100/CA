

public class StudentsUnion {

	private int caps, hoodies, tshirts;

	private double totalCost, totalCaps, totalHoodies, totalTshirts;


public StudentsUnion(){
	caps = 0;
	hoodies = 0;
	tshirts = 0;
	totalCost = 0.0;
	totalHoodies = 20.00;
	totalTshirts = 10.00;
	totalCaps = 5.00;

	public void setCaps(int caps){
	this.caps = caps;
}
	public void setHoodies(int hoodies){
	this.hoodies = hoodies;
}
	public void setTshirts(int tshirts){
	this.tshirts = tshirts;
}

	public void compute(){
	totalCaps = totalCaps + caps;
	totalHoodies = totalHoodies + hoodies;
	totalTshirts = totalTshirts + Tshirts;

	totalCost = totalTshirts + totalCaps + totalHoodies;
}

public double getTotalCost(){
	return totalCost;

}

		}
	}


