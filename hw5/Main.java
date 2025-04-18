package hw5;

public class Main {

	public static void main(String[] args) {
		Ticket t=new Ticket();
		Ticket.setAvailableTicket(2);
		t.setPrice(50);
		t.setTicketId(123);
		int tot=t.calculateTotalCost(2);
		
		if(tot!=-1) {
			System.out.println("Total cost: "+tot);
		}
	}
}
