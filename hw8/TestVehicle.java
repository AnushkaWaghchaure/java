package hw8;

public class TestVehicle{

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(101, "Honda City", "4 wheeler", 500000);
        Vehicle v2 = new Vehicle(102, "Bajaj", "3 wheeler", 200000);
        Vehicle v3 = new Vehicle(103, "Activa", "2 wheeler", 100000);

        System.out.println("Vehicle 1 Loan: " + v1.issueLoan());
        System.out.println("Vehicle 1 Insurance: " + v1.takeInsurance());

        System.out.println("Vehicle 2 Loan: " + v2.issueLoan());
        System.out.println("Vehicle 2 Insurance: " + v2.takeInsurance());

        System.out.println("Vehicle 3 Loan: " + v3.issueLoan());
        System.out.println("Vehicle 3 Insurance: " + v3.takeInsurance());		
	}
}
