package hw9;

public class TestMain {

	public static void main(String[] args) {
		BusTicket b=new BusTicket(10,22.3f,new Person("Seema",'F',61));
		b.calculateTotal();
		b.getTicketDetails();
	}

}
