package hw6;

public class Hosteller extends Student{
	private String hostelName;
	private int roomNo;
	private String phoneNo;
	

	
	public Hosteller(int studId, String name, int deptId, String hostelName, int roomNo, String phoneNo) {
		super(studId, name, deptId);
		this.hostelName = hostelName;
		this.roomNo = roomNo;
		this.phoneNo = phoneNo;
	}

	public void HostellerDetails() {
		System.out.println("Student Id: "+super.studId);
		System.out.println("Student Name: "+super.name);
		System.out.println("Department Id: "+super.deptId);
		System.out.println("Hostel Name: "+hostelName);
		System.out.println("Student Room No: "+roomNo);
		System.out.println("Phone No: "+phoneNo);
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
