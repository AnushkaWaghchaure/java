package practice;

import java.util.Scanner;

public class Positive_or_Negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:: ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num+" +ve number");
		}else if(num<0) {
			System.out.println(num+" +ve number");
		}else {
			System.out.println(num+" number is zero");
		}
	}
}
