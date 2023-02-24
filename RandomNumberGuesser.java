import java.util.Scanner;

/*
 *  Class: CMSC203 CRN 30376 
 *  Program: Assignment 2
 *  Instructor: Grinberg 
 *  Summary of Description: Generate a random number and responds if the guess is correct or not 
 *  Due Date: 02/27/2023  
 *  Integrity Pledge: I pledge that I have completed the programming assignment independently. 
 *  I have not copied the code from a student or any source. 
 *  David Sawma 
 */

public class RandomNumberGuesser {
	
	public static void main(String [] args)
	{
		
		// Create Scanner for input
		
		Scanner keyboard = new Scanner(System.in);
		
		//Create RNG object
		
		RNG rng = new RNG();
		
		// Variables
		//guess holds the user's guess
		int guess, 
		//high holds the high value
		high = 100,
		//low holds the low value
		low = 0;
		//tryAgain holds the input for playing again
		String tryAgain= "";
		
		//Prompt the user of the application
		
		System.out.println("This application generates a random integer betwen 0 and 100");
		System.out.println(" and asks the user to guess repeatedly until they guess correctly.\n");
		
		//Generates a random number by calling rand and assigning it to answer
		
		int answer =rng.rand();
		
		//resets the counter with resetCount
		
		rng.resetCount();
		
		//Ask for first guess and holds it in guess
		
		System.out.println("Enter your first guess:");
		guess = keyboard.nextInt();
		
		//Use inputValidation to make sure the guess is valid
		// While loop to keep asking until a valid answer is given 
		
		while (!rng.inputValidation(guess, low, high))
		{
			System.out.println("Number of guesses is: " + rng.getCount());
			System.out.println("Enter your next guess between " + low + " and " + high);
			guess = keyboard.nextInt();
		}
		
		// If statement for incorrect guess
		
		if(answer != guess)
		{
			//If statemetn if the guess is too high or low
			// high or low is assigned with new values
			//Ask for new guess
			
			if(guess > answer) {
				System.out.println("Your guess is too high");
				high = guess;
				System.out.println("Number of guesses is: " + rng.getCount());
				
			}
			else if(guess < answer) {
				System.out.println("Your guess is too low");
				low = guess;
				System.out.println("Number of guesses is: " + rng.getCount());
			}
			System.out.println("Enter your next guess between " + low + " and " + high);
			guess = keyboard.nextInt();
		}
		
		//Another while loop for inputValidation
		
		while (!rng.inputValidation(guess, low, high) && !(rng.getCount() > 7))
		{
			System.out.println("Number of guesses is: " + rng.getCount());
			System.out.println("Enter your next guess between " + low + " and " + high);
			guess = keyboard.nextInt();
		}
		
		// While loop for incorrect guesses and keeps using inputValidation
		
		while((answer!= guess) && !(rng.getCount() > 7))
		{
			if(guess > answer) {
				System.out.println("Your guess is too high");
				high = guess;
				System.out.println("Number of guesses is: " + rng.getCount());
			}
			else if(guess < answer) {
				System.out.println("Your guess is too low");
				low = guess;
				System.out.println("Number of guesses is: " + rng.getCount());
			}
			System.out.println("Enter your next guess between " + low + " and " + high);
			guess = keyboard.nextInt();
			while (!rng.inputValidation(guess, low, high) && !(rng.getCount() > 7))
			{
				System.out.println("Number of guesses is: " + rng.getCount());
				System.out.println("Enter your next guess between " + low + " and " + high);
				guess = keyboard.nextInt();
			}
		}
		
		//If the counter is greater than 7, stop the program
		
		if (rng.getCount() > 7)
		{
			System.out.println("You have exceeded the maximum number of guesses, 7 ");
		}
		
		//If guess is correct, ask to try again
		
		if (answer == guess)
		{
			System.out.println("Congratulations, you guessed correctly");
			System.out.print("Try again? (yes or no)\n");
			tryAgain = keyboard.nextLine();
			tryAgain = keyboard.nextLine();
		}
		
		//while loop to keep playing as long as the answer is yes
		
		while(tryAgain.equalsIgnoreCase("yes"))
		{
			
			//reset high, low, counter
			// Generate new random number 
			
			answer =rng.rand();
			
			high = 100;
			low = 0;
			
			rng.resetCount();
			
			System.out.println("Enter your first guess:");
			guess = keyboard.nextInt();
			
			while (!rng.inputValidation(guess, low, high))
			{
				System.out.println("Number of guesses is: " + rng.getCount());
				System.out.println("Enter your next guess between " + low + " and " + high);
				guess = keyboard.nextInt();
			}
			
			if(answer != guess)
			{
				if(guess > answer) {
					System.out.println("Your guess is too high");
					high = guess;
					System.out.println("Number of guesses is: " + rng.getCount());
					
				}
				else if(guess < answer) {
					System.out.println("Your guess is too low");
					low = guess;
					System.out.println("Number of guesses is: " + rng.getCount());
				}
				System.out.println("Enter your next guess between " + low + " and " + high);
				guess = keyboard.nextInt();
			}
			
			while (!rng.inputValidation(guess, low, high) && !(rng.getCount() > 7))
			{
				System.out.println("Number of guesses is: " + rng.getCount());
				System.out.println("Enter your next guess between " + low + " and " + high);
				guess = keyboard.nextInt();
			}
			
			while((answer!= guess) && !(rng.getCount() > 7))
			{
				if(guess > answer) {
					System.out.println("Your guess is too high");
					high = guess;
					System.out.println("Number of guesses is: " + rng.getCount());
				}
				else if(guess < answer) {
					System.out.println("Your guess is too low");
					low = guess;
					System.out.println("Number of guesses is: " + rng.getCount());
				}
				System.out.println("Enter your next guess between " + low + " and " + high);
				guess = keyboard.nextInt();
				while (!rng.inputValidation(guess, low, high) && !(rng.getCount() > 7))
				{
					System.out.println("Number of guesses is: " + rng.getCount());
					System.out.println("Enter your next guess between " + low + " and " + high);
					guess = keyboard.nextInt();
				}
			}
			
			
			
			if (answer == guess)
			{
				System.out.println("Congratulations, you guessed correctly");
				System.out.print("Try again? (yes or no)\n");
				tryAgain = keyboard.nextLine();
				tryAgain = keyboard.nextLine();
			}
			if (rng.getCount() > 7)
			{
				System.out.println("You have exceeded the maximum number of guesses, 7 ");
			}
		}
		
		System.out.println("Thanks for playing...\n");
		System.out.println("Programmer Name: David Sawma");
		
	}

}
