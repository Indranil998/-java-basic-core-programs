import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		System.out.println("Welcome To Harmonic Number Program");

		// INPUT Nth number which have to calculate Harmonic Number
		Scanner scanner = new Scanner(System.in);
		int nth = 0;
		while (nth == 0) {
			System.out.print("Enter positive number : ");
			nth = scanner.nextInt();
			if (nth < 0) {
				nth = -nth;
			}
		}
		System.out.println("You have to show "+nth+"s Harmonic Number");
		System.out.println(nth+"th Harmonic is "+harmonic(nth));
		scanner.close();
	}
	public static double harmonic (int nth) {
		if (nth == 1) {
			return 1;
		} else {
			return harmonic(nth-1) + ((double)1/nth);
		}
	}

}