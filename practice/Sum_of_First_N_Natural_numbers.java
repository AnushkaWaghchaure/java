package practice;

import java.util.Scanner;

public class Sum_of_First_N_Natural_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,i;
		System.out.println("Enter how many nos do u want to enter? ");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is:: "+sum);
	}

}
