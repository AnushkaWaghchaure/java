package practice;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" Even number");
		}else {
			System.out.println(num+" Odd number");
		}
	}

}
