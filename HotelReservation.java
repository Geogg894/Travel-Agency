

public class HotelReservation extends Reservation {
	
	private Hotel h;
	private String Roomtype;
	private int nights;
	private int pricePerNight;
	
	public HotelReservation(String clientname, Hotel h,String Roomtype,int nights) {
		
		super(clientname); 

	   
		this.h=h;
		this.Roomtype=Roomtype;
		this.nights=nights;
		
		try {
		
		pricePerNight=h.reserveRoom(Roomtype);
		
		}
		
        catch(Exception e) {
        	
        	e.printStackTrace();
        }
		
		
		if(Roomtype!=this.Roomtype) {
			
			throw new IllegalArgumentException("Such reservation is not possible");
		}
		
		
		}
		
	public int getNumOfNights() {
		
		return nights;
	}	
		
		public int getCost() {
			
			
			return pricePerNight*nights;
		}
		
		public boolean equals(Object o) {
			
			if (o instanceof HotelReservation) {
				
				HotelReservation Hotel=(HotelReservation) o;
			
			
		 if(this.reservationName()==Hotel.reservationName()&& this.h==Hotel.h&&this.Roomtype==Hotel.Roomtype&&this.getNumOfNights()==Hotel.getNumOfNights()&&this.getCost()==Hotel.getCost()) {
			 
			 return true;
		 }
				
		 
			 
		}
			 return false;
	}
		 }
