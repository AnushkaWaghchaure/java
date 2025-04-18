package hw2;

public class Cylinder {
	double radius,height,vol;
	
	public Cylinder() {
		super();
	}

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
	void display() {
		System.out.println("Cylinder volumn is:: "+ 3.14*radius*radius*height);
	}
}
