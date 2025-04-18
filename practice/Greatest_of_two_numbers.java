package practice;

import java.util.Scanner;

public class Greatest_of_two_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		if(a<b) {
			System.out.println("b is greater"+b);
		}else {
			System.out.println("a is greater"+a);
		}
	}

}
