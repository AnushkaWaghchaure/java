package hw4;

public class Main {

	public static void main(String[] args) {
		Book b=new Book();
		
		b.setBookPrice(100);
		b.setBookName("Harry Potter");
		b.setAuthorName("Harry");
		
		System.out.println("Book Price is: "+b.getBookPrice());
		System.out.println("Book Name is: "+b.getBookName());
		System.out.println("Book Author is: "+b.getAuthorName());
	}

}
