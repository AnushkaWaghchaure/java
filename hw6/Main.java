package hw6;

public class Main {

	public static void main(String[] args) {
		Hosteller h = new Hosteller(5220, "Ram", 1, "XYZ", 12,"84579575");
		h.HostellerDetails();
		
		
		h.setRoomNo(20);  
	    h.setPhoneNo("9999999999");  

	        
	    System.out.println("------ Hosteler Details ------");
	    System.out.println("Student ID: " + h.getStudId());
	    System.out.println("STudent Name: " + h.getName());
	    System.out.println("Department ID: " + h.getDeptId());
	    System.out.println("Hostel Name: " + h.getHostelName());
	    System.out.println("Room No: " + h.getRoomNo());
	    System.out.println("Phone No: " + h.getPhoneNo());
		
		
	}
}
