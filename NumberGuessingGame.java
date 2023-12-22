import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int minRange = 1;
		int maxRange = 100;
		int attemptLimit = 10;
		int round = 0;
		int totalAttempt = 0;
		
		System.out.println("Welcome to our Number Game");
		System.out.println("You have " + attemptLimit + " attempt to guess the number between " + minRange + " to " + maxRange + ".");

	while(true)
	{
		round++;
		int numberToGuess = rd.nextInt(maxRange - minRange + 1) + minRange;
		int attempt = 0;

		while(attempt < attemptLimit)
		{
			System.out.print("Attempt " + (attempt + 1) + ": Enter your guess: " );
			int userGuess = sc.nextInt();
			attempt++;
			
			if(userGuess < numberToGuess)
			{
				System.out.println("Too low! Try again.");
			} 
			else if(userGuess > numberToGuess)
			{
				System.out.println("Too high! Try again.");
			}
			else
			{
				System.out.println("Congrats! You guessed the number " + numberToGuess + " in " + attempt +" attempts.");
				break;
			}
		}
		totalAttempt += attempt;
		System.out.println("Round " + round + " over. Your score for this round: " + attempt + " attempts.");

		System.out.print("Do you want to play another round? (yes/no): ");
		String playAgain = sc.next();
		if(!playAgain.equalsIgnoreCase("yes"))
		{
			break;
		}
		System.out.println("Game over! You played " + round + " rounds. Your total score: " + totalAttempt + " attempts.");
	}
    }
}							

