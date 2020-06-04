

public class Customer {
	
	
	private String name;
	private int balance;
	private Basket MultiReservations;
	
	
	public Customer(String name, int balance) {
		
		this.name=name;
		this.balance=balance;
		
		MultiReservations=new Basket();
	}
	
	
	public String getName() {
		
		return name;
	}
	
	public int getBalance() {
		
		return balance;
		
	}
	
	
	public Basket getBasket() {
		
		return MultiReservations;
		
		
	}
	
	
	public int addFunds(int n) {
		
		if (n<0) {
			
			throw new IllegalArgumentException("Negative input---not applicable");
				
		}
		
		else {
			
			balance+=n;
		}
		
		return balance;
	}
	
	

public int addToBasket(Reservation g) {
		
		if(g.reservationName().equals(name)) {
			
        try {
			
		MultiReservations.add(g);}
        
        catch(Exception e) {
        	
        	e.printStackTrace();
        }
		return MultiReservations.getNumOfReservations();
				
		}
		
		else {
			
			throw new IllegalArgumentException("addBasket operation failed");
		}
		
		
	}
	public int addToBasket(Hotel h,String Roomtype, int nights, boolean included) {
		
		if(included==true) {
			
			try {
			
			BnBReservation b=new BnBReservation(name,h,Roomtype,nights);
			MultiReservations.add(b);
			
			}
			
			catch(Exception e) {
	        	
	        	e.printStackTrace();
	        }
			
		}
		
		else {
			
			try {
			
			HotelReservation z=new HotelReservation(name,h, Roomtype, nights);
			
			MultiReservations.add(z);
			
			}
			
			catch(Exception e) {
	        	
	        	e.printStackTrace();
	        }
			
	}
		
		return MultiReservations.getNumOfReservations();
	}
	
	public int addToBasket(Airport A1,Airport A2) {
		
		FlightReservation d=new FlightReservation(name,A1,A2);
		
		try {
		
		MultiReservations.add(d);
		
		}
		
        catch(Exception e) {
        	
        	e.printStackTrace();
        }
		
		return MultiReservations.getNumOfReservations();
	}
	
	
	public boolean removeFromBasket(Reservation r) {
		
		
		return MultiReservations.remove(r);
	
		
	}
	
public int checkOut() {
		
		if (balance<MultiReservations.getTotalCost()) {
			
			throw new IllegalStateException("Not enough credit for payment");
		}
		
		else {
			
			balance-=MultiReservations.getTotalCost();
			MultiReservations.clear();
			
			return balance;
		}
		
	}
	
	
	

}
