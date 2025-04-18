package practice;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:: ");
		int n=sc.nextInt();
		int i,no=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				no++;
			}
		}
		if(no==2) {
			System.out.println("It is Prime number");
		}else{
			System.out.println("It is not a Prime number");
		}
	}

}
