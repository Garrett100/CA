


public class VariablesAndInstanceVariables {

	private int number;
	public String address;

	public void printMessage(){
		System.out.println(number);
		System.out.println(address);
		String fullAddress; //declaration of a
		fullAddress = "County Dublin";
		System.out.println(fullAddress);
	}

	public void anotherMethod(){
		String fullAddress = "County Dublin, Ireland";
		System.out.println(fullAddress);

	public void setNumber(int number){
		this.number = number;


//get method//
public int getNumber(){
return number;
}
}