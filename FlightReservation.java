
public class FlightReservation extends Reservation {
	
	private Airport Departure;
	private Airport Arrival;
	
	public FlightReservation(String clientname,Airport Departure,Airport Arrival) {
		
	   super(clientname); 

	    
		this.Arrival=Arrival;
		this.Departure=Departure;
		
		
		
		if(Departure.equals(Arrival)) {
			
			throw new IllegalArgumentException(("The two airports are the same"));
		}
			    
	
	}
	
	
	public int getCost() {
		

		int Cost = (int)Math.ceil(5375 + Departure.getFees() + Arrival.getFees()+(Airport.getDistance(Departure, Arrival)/167.52 )*124);
		
		return Cost;
	
	}
	
	public boolean equals(Object o) {
		
		if (o instanceof FlightReservation) {
			
			FlightReservation Flight=(FlightReservation) o;
		
		
	 if(this.reservationName()==Flight.reservationName()&& this.Arrival==Flight.Arrival&&this.Departure==Flight.Departure) {
		 
		 return true;
	 }
			
	 
		 
	}
		 return false;
}
	 }
