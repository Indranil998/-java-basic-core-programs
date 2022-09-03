import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Welcome To Even Or Odd Program");
		Scanner scanner = new Scanner(System.in);
		// INPUT number
		int number = 0;
		System.out.print("Enter number : ");
		number = scanner.nextInt();
		System.out.println("You entered "+number);

		if (number % 2 == 0) {
			System.out.println(number+" is Even");
		} else {
			System.out.println(number+" is Odd");
		}
		scanner.close();
	}

}