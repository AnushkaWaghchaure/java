package practice;

public class Sum_of_digits_of_a_number {

	public static void main(String[] args) {
		int n=123;
		int sum=0;
		while(n!=0) {
			int nn=n%10;
			sum=sum+nn;
			n=n/10;
		}
		System.out.println("The sum is: "+sum);
	}

}
