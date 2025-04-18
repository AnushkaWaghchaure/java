package hw7;

public class Doctor extends Person{
	double salary;
	String specializationType;
		
	void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Specialization Type: "+specializationType);
	}

	public Doctor(String name, double salary, String specializationType) {
		super(name);
		this.salary = salary;
		this.specializationType = specializationType;
	}
}
