package hw7;

public class TestMain {

	public static void main(String[] args) {
//		Doctor d=new Doctor("Ram", 25000.4, "Surgen");
//		
//		d.displayDetails();
		
		 Doctor d = new Doctor("Ram", 25000.4, "Surgen");
	     System.out.println("Details are: " + Show(d));
	     System.out.println("------------------------");
	     Nurse n=new Nurse("khushi", 20, "Morning", 1000);
	 	System.out.println("Nurse details are: ");
	 	n.displayDetails1();
	}
	static String Show(Doctor d) {
		d.displayDetails();
		return "Done";
	}
}
