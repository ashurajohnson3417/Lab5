import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// prompt user to input an integer 1-10
		Scanner input = new Scanner(System.in);
		boolean go = false;
		while (!go) {
			System.out.println("Enter a positive integer 1-10");
			long userInt = input.nextLong();
			long fact = 1;
			// display the factorial of the number entered by the user
			for (long i = 1; i <= userInt; i++) {
				fact = fact * userInt;
			}
			System.out.println("The factorial of " + userInt + " is " + fact);
			// prompt user to continue
			System.out.println("Would you like to continue. Enter Y or N");
			input.nextLine();
			String userResponse = input.nextLine();
			if (!userResponse.equalsIgnoreCase("y")) {
				System.out.println("Exiting");
				go = true;
			}
		}
	}
}
