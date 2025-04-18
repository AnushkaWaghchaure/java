package hw5;

public class Ticket {
	private int ticketId;
	private int price;
	static private int availableTicket;
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTicket() {
		return availableTicket;
	}
	public static void setAvailableTicket(int availableTicket) {
		Ticket.availableTicket = availableTicket;
	}
	
	public int calculateTotalCost(int ticket) {
		if(ticket<=0) {
			System.out.println("Ticket cannot be zero");
			return -1;
		}
		
		availableTicket=availableTicket-ticket;
		int totalCost=price*ticket;
		return totalCost;
	}		
}
