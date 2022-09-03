import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Power Of 2 Program");
		// INPUT Nth number up to which calculate Power Of 2 Table
		int nth = Integer.parseInt(args[0]);
		if (nth < 0) {
			nth = -nth;
		}
		System.out.println("You want show power of 2 table upto "+nth);
		double result = 1;
		for (int number = 1; number <= nth; number++) {
			result *= 2;
			System.out.println("2^"+number+" = "+result);
		}
	}

}