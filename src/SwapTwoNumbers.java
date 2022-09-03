import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Welcom To Swap Two Numbers Program");

		Scanner scanner = new Scanner(System.in);
		// INPUT first number
		int first = 0;
		System.out.print("Enter first number : ");
		first = scanner.nextInt();
		// INPUT second number
		int second = 0;
		System.out.print("Enter second number : ");
		second = scanner.nextInt();

		System.out.println("First number is "+first);
		System.out.println("Second number is "+second);

		int temp = first;
		first = second;
		second = temp;
		System.out.println("After Swap");

		System.out.println("First number is "+first);
		System.out.println("Second number is "+second);
		scanner.close();
	}

}