import java.util.Scanner;

public class Factors {

	public static int getLCF(int number) {
		for (int i=2; i*i<=number; i++ ) {
			if ( (number%i) == 0) {
				return i;
			}
		}
		return number;
	}

	public static void factors(int number) {
		int LCF = getLCF(number);
		System.out.println(LCF);
		if (number != LCF) {
			factors(number/LCF);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Factors Program");
		// INPUT Nth number which have to calculate Factors
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		while (number == 0) {
			System.out.print("Enter positive number : ");
			number = scanner.nextInt();
			if (number < 0) {
				number = -number;
			}
		}
		System.out.println("You have to show "+number+"s Factors");
		factors(number);
		scanner.close();
	}
}