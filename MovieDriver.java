import java.util.Scanner;
public class MovieDriver {
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in);
		Movie mov = new Movie();
		String movie, rating, input;
		int tickets;
		char answer;
		
		do
		{
		System.out.println("Enter the name of a movie: ");
		movie = keyboard.nextLine();
		mov.setTitle(movie);
		
		System.out.println("Enter the rating of a movie: ");
		rating  = keyboard.nextLine();
		mov.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie: ");
		tickets = keyboard.nextInt();	
		mov.setSoldTickets(tickets);
		
		System.out.println(mov.toString());
		
		keyboard.nextLine();
		
		System.out.println("Do you want to enter another? (y or n) ");
		input = keyboard.nextLine();
		answer = input.charAt(0);
		
		}while(answer == 'y' || answer == 'Y');
		
		System.out.println("Goodbye");
	}
	
}

