import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		/* Write a program that enters from the console number n and
		 *  n strings, then sorts them alphabetically and prints them
		 */

		Scanner in = new Scanner(System.in);
		System.out.printf("Enter the number of strings n = ");
		int n = in.nextInt();
		
		String[] inputs = new String[n];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = in.next();
		}
		Arrays.sort(inputs);
		
		System.out.printf("Aranged array is: %n");
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i]);
		}
		in.close();
	}

}
