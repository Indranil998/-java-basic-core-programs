import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Welcome To Leap Year Program");
		// INPUT year it should be 4 digit positive integer
		Scanner scanner = new Scanner(System.in);
		int year = 0;
		while (year == 0) {
			System.out.print("Enter year (it should be 4 digit number) : ");
			year = scanner.nextInt();
			if (year < 1000 || 10000 <= year) {
				year = 0;
				System.out.println("Please enter correct year");
			}
		}
		System.out.println("Year you entered : "+year);
		if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year+" is leap year");
		} else {
			System.out.println(year+" is not leap year");
		}
		scanner.close();
	}

}