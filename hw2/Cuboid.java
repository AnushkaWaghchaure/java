package hw2;

public class Cuboid {
	int length,breadth,height,vol1;

	public Cuboid() {
		super();
	}
	
	public Cuboid(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	void display1() {
		System.out.println("Cuboid volumn is:: "+length*breadth*height);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getVol1() {
		return vol1;
	}

	public void setVol1(int vol1) {
		this.vol1 = vol1;
	}
}
