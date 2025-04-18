package hw7;

public class Nurse extends Person {
	int hrsWorked;
	String shift;
	double hrRate;
	
	public Nurse(String name) {
		super(name);
		hrsWorked=20;
		shift="Morning";
		hrRate=1200.5;
	}

	public Nurse(String name, int hrsWorked, String shift, double hrRate) {
		super(name);
		this.hrsWorked = hrsWorked;
		this.shift = shift;
		this.hrRate = hrRate;
	}
	
	public void displayDetails1() {
		System.out.println("Name: "+name);
		System.out.println("hrsWorked: "+hrsWorked);
		System.out.println("shift: "+shift);
		System.out.println("hrRate: "+hrRate);
	}
}
