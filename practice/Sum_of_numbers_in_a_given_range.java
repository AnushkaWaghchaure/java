package practice;

import java.util.Scanner;

public class Sum_of_numbers_in_a_given_range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=5,i;
		int b=10;
		int sum=0;
		for(i=a;i<=b;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is:: "+sum);
	}

}
