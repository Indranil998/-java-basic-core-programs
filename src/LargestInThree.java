import java.util.Scanner;

public class LargestInThree {

	public static void main(String[] args) {
		System.out.println("Welcome To Largest Among Three Numbers Program");
		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[3];
		// INPUT second number
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter "+(i+1)+" number : ");
			numbers[i] = scanner.nextInt();
		}
		System.out.println("You entered three numbers are "+numbers[0]+", "+numbers[1]+", "+numbers[2]);
		int largest = numbers[0];
		for (int i = 0; i < 3; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println("Largest number is "+largest);
		scanner.close();
	}

}
