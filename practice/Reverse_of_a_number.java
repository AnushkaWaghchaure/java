package practice;

public class Reverse_of_a_number {

	public static void main(String[] args) {
		int n=123;
		int rev=0,sum=0;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("Reverse is:: "+rev);
	}

}
