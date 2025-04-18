package hw9;

public class BusTicket{
	private int ticketNo;
	private float ticketPrice;
	private float totalAmount;
	Person person;
	
	public BusTicket(int i, double d, Person person2) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BusTicket(int ticketNo, float ticketPrice, Person person) {
		super();
		this.ticketNo = ticketNo;
		this.ticketPrice = ticketPrice;
		this.person = person;
	}

	void calculateTotal() {
		if(person.getAge()<16) {
			totalAmount=(int) (ticketPrice-0.5);
		}else if(person.getAge()>=60) {
			totalAmount=(int) (ticketPrice-2.5);
		}else if(person.getGender()=='F') {
			totalAmount=(int) (ticketPrice-0.1);
		}else {
			System.out.println("No discount for remaining category");
		}
	}
	
	public void getTicketDetails() {
			System.out.println(getTicketNo());
			System.out.println(getTicketPrice());
			System.out.println(getTotalAmount());
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
