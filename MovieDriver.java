import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Movie a = new Movie();
		
		String title, rating, answer;
		
		int soldTickets;
		
		System.out.println("Enter the name of a movie");
		
		title = keyboard.nextLine();
		
		a.setTitle( title);
		
		System.out.println("Enter the rating of the movie");
		
		rating = keyboard.nextLine();
		
		a.setRating( rating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		
		soldTickets = keyboard.nextInt();
		
		a.setSoldTickets(soldTickets);
		
		System.out.println(a.toString());
		
		System.out.print("Do you want to enter another? (y or n)\n");
		
		answer = keyboard.nextLine();
		answer = keyboard.nextLine();
		
		while( answer.equals("y"))
		{
			System.out.println("Enter the name of a movie");
			
			title = keyboard.nextLine();
			
			a.setTitle( title);
			
			System.out.println("Enter the rating of the movie");
			
			rating = keyboard.nextLine();
			
			a.setRating( rating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			
			soldTickets = keyboard.nextInt();
			
			a.setSoldTickets(soldTickets);
			
			System.out.println(a.toString());
			
			System.out.print("Do you want to enter another? (y or n)\n");
			
			answer = keyboard.nextLine();
			answer = keyboard.nextLine();
		}

	}

}
