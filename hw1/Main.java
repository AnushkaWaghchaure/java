package hw1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the use input:: ");
		String userInput=sc.nextLine();
		
			String collegeName="ABC Technical Institute";
			if(userInput.equals("Yes")) {
				 s.setCollegeName(collegeName);
				s.display();
					}else if(userInput.equals("No")){
						Student s1=new Student(11, "Rani", "Mumbai", "S.S.G");
						s1.display();
				}else {
					System.out.println("Wrong input: and get the input again ^ ^"+userInput);
				}
		}
}