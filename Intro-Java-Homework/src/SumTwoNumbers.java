import java.util.Scanner;


public class SumTwoNumbers {

	public static void main(String[] args) {
		/* Write a program that enters two integers from the console,
		 *  calculates and prints their sum
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter first integer number: ");
		int a = in.nextInt();
		System.out.printf("Enter second integer number: ");
		int b = in.nextInt();
		
		int result = a + b;
		System.out.println("The sum of the numbers is: " + result);
		in.close();

	}

}
