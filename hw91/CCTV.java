package hw91;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CCTV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter total cost of CCTV cameras: ");
            int totalCost = sc.nextInt();

            System.out.print("Enter number of cameras purchased: ");
            int number = sc.nextInt();

            if (number == 0) {
                throw new ArithmeticException();
            }

            int cost = totalCost / number;
            System.out.println("Cost of each camera: " + cost);

        } catch (InputMismatchException e) {
            System.out.println("Input is not an integer");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Enter the number (non-zero) of cameras purchased");
        } catch (Exception e) {
            System.out.println("Error occurred: ");
        }
    }
}
