import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice=0;
		TicketBookingClass t=new TicketBookingClass();
		t.addMovie();
		do {
			//TicketBookingClass t=new TicketBookingClass();
			System.out.println("Welcome to XYZ threater");
			System.out.println("Please chhose a option");
			System.out.println("1. Book a movie");
			System.out.println("2. Exit");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			int movie=0;
		    if(choice==1) {
		    	int seatNumber=0;
		    	System.out.println("Please choose a movie");
		    	t.showMovieList();
		    	movie=sc.nextInt();
		    	t.movieList[movie-1].showTicketStatus();
		    	System.out.println("Please choose a seat number");
		    	seatNumber=sc.nextInt();
		    	t.movieList[movie-1].bookTicket(t.movieList[movie-1].getName(), seatNumber);
		    	
		    }
			
		}
		while(choice!=2);

	}

}
