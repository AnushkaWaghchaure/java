package hw92;

import java.util.Scanner;

public class password {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the username: ");
        String username=sc.nextLine();
        
        System.out.println("Enter the password: ");
        String pass=sc.nextLine();
        
        if(pass.length()<8) {
        	System.out.println("Error");
        }
	} 
}
