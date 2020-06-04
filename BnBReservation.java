
public class BnBReservation extends HotelReservation {
	
	public  BnBReservation(String clientname,Hotel h,String Roomtype, int nights) {
		
		super(clientname,h,Roomtype,nights);
	}
	
	public int getCost() {
		
		return (super.getNumOfNights()*1000)+super.getCost();
	}

}
