
abstract public class  Reservation { 

	
	private String clientname;
	
	
	public Reservation(String clientname) {
		
		this.clientname=clientname;
		
		
	}
	
	public final String reservationName(){
		
		return clientname;
		
	}
	
	abstract public  int getCost();
	
	

	abstract public boolean equals(Object obj);
	
	
}