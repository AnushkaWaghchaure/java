package hw8;

public class Vehicle implements Loan,Insurance{
	private int vehicleNo;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public Vehicle(int vehicleNo, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNo = vehicleNo;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	
	public double issueLoan() {
		double amount=0;
		if(vehicleType=="4 wheeler") {
			System.out.println("Eligible");
			amount=(int) (price * 0.75);
		}else if(vehicleType=="3 wheeler") {
			System.out.println("Eligible");
			amount=(int) (price * 0.70);
		}else if(vehicleType=="2 wheeler") {
			System.out.println("Eligible");
			amount=(int) (price * 0.60);
		}
		return amount;
	}
	
	public double takeInsurance(){
		double insuranceAmt = 0;
		if(price<=150000) {
			insuranceAmt=4000;
			System.out.println(insuranceAmt);
		}else if(price>=150000 && price<=300000) {
			insuranceAmt=4500;
			System.out.println(insuranceAmt);
		}else if(price>=300000) {
			insuranceAmt=6000;
			System.out.println(insuranceAmt);
		}
		return insuranceAmt;
	}
}
