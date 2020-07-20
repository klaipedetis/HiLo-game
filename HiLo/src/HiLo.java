import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {

			int theNumber = (int)(Math.random() * 100 + 1);
			//System.out.println(theNumber);
			int guess = 0;

			while (guess != theNumber) {
				System.out.println("guess a number between 1 and 100:");
				guess = scan.nextInt();
				System.out.println("You entered " + guess + ".");
				if (guess < theNumber)
					System.out.println(guess + "is too low. Try again.");
				else if (guess > theNumber)
					System.out.println(guess + "is too high. Try again.");
				else
					System.out.println(guess + "is correct. You win!.");
			}//Конец цикла while
			System.out.println("Would you like to play again (y/n)?");
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}

}
