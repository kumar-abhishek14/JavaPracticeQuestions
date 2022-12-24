
public class TicketBookingClass {
	public Movie[] movieList=new Movie[2];
      public void addMovie(){
    	  Movie movie1=new Movie("Avatar");
    	  Movie movie2=new Movie("Bikram");
    	  movieList[0]=movie1;
    	  movieList[1]=movie2;
    	  
      }
      public void showMovieList() {
    	  for(int i=0;i<movieList.length;i++) {
    		  System.out.println(i+1+"."+movieList[i].getName());
    	  }
      } 
}
 
