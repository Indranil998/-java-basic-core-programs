import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
		System.out.println("Welcome To Quotient And Reminder Program");
		Scanner scanner = new Scanner(System.in);
		// INPUT dividend
		int dividend = 0;
		while (dividend == 0) {
			System.out.print("Enter dividend : ");
			dividend = scanner.nextInt();
		}
		// INPUT divisor
		int divisor = 0;
		while (divisor == 0) {
			System.out.print("Enter divisor : ");
			divisor = scanner.nextInt();
			if (divisor == 0) {
				divisor = 1;
			}
		}
		System.out.println("Dividend is "+dividend);
		System.out.println("Divisor is "+divisor);

		System.out.println("Quotient is "+(dividend/divisor));
		System.out.println("Reminder is "+(dividend%divisor));
		scanner.close();
	}

}
