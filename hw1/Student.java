package hw1;

public class Student {
	private int studentId;
	private String StudentName;
	private String StudentAdress;
	private String collegeName;
	
	public Student() {
		super();
		studentId=10;
		StudentName="Ram";
		StudentAdress="Pune";
		collegeName="ABC Technical Institute";
	}

	public Student(int studentId, String studentName,String StudentAdress) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		this.StudentAdress=StudentAdress;
	}

	public Student(int studentId, String studentName,String StudentAdress,String collegeName) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		this.StudentAdress=StudentAdress;
		this.collegeName=collegeName;
	}
	public void display() {
		System.out.println("studentId : "+studentId);
		System.out.println("StudentName : "+StudentName);
		System.out.println("StudentAdress : "+StudentAdress);
		System.out.println("collegeName : "+collegeName);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentAdress() {
		return StudentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		StudentAdress = studentAdress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}
