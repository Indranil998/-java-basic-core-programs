import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		System.out.println("Welcome To Vowel Or Consonant Program");
		String vowel = "aeiouAEIOU";
		Scanner scanner = new Scanner(System.in);
		// INPUT character
		String character;
		System.out.print("Enter character : ");
		character = scanner.nextLine();
		System.out.println("You entered character "+character);
		if (vowel.contains(String.valueOf(character.charAt(0)))) {
			System.out.println(character+" is VOWEL");
		} else {
			System.out.println(character+" is CONSONANT");
		}
		scanner.close();
	}

}