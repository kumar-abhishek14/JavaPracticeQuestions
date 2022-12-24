
public class Movie {
    String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String[] ticket=new String[10];
	public Movie(String name) {
		this.name=name;
		for(int i=0;i<ticket.length;i++) {
			ticket[i]="NotBooked";
		}
	} 
	public void bookTicket(String name,int seatNumber) {
	       if(name.equalsIgnoreCase(this.name)) {
	    	     if(!ticket[seatNumber-1].equalsIgnoreCase("Booked")) {
	    	       ticket[seatNumber-1]="Booked";
	    	       System.out.println("We have booked a seat for you");
	    	       System.out.println("Please find the details:");
	    	       System.out.println("Movie name"+name);
	    	       System.out.println("SeatNumber :"+seatNumber);
	    	   }
	    	     else {
	    	    	 System.out.println("Sorry seat is already booked");
	    	     }	      
}
}
	public void showTicketStatus() {
		for(int i=0;i<ticket.length;i++) {
			System.out.println(ticket[i]);
		}
	}
	
}
