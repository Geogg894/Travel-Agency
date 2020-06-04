

public class Basket {
	
	private Reservation[] myReservations;
	
	public Basket() {
		
		Reservation[] myReservations= {};		

		this.myReservations=myReservations;
	    
		
	}
	
	

	public Reservation[] getProducts() {
		
		Reservation[] Reserves2=myReservations;
		
		return Reserves2;
	}	
	
	
	public int add(Reservation g) {
		
		Reservation[] Reserves2=myReservations;
		
		
		myReservations=new Reservation[myReservations.length+1];
		//making space to add new element.
		
		for(int i=0;i<Reserves2.length;i++){
			
		
			myReservations[i]=Reserves2[i];
			
		}
		
		try {
		
			myReservations[myReservations.length-1]=g;
			
		}
			
			catch(Exception e) {
	        	
	        	e.printStackTrace();
	        }
			
			return myReservations.length;
		
		}
		
	    
	public boolean remove(Reservation g) {
		
		Reservation[] Reserves2=myReservations;
		
		
		for(int i=0;i<myReservations.length;i++) {
			
			if(myReservations[i].equals(g)) {
				
				try {
				
				myReservations=new Reservation[myReservations.length-1];

				}
				
				catch(Exception e) {
		        	
		        	e.printStackTrace();
		        }
				
				for (int l=0;l<i;l++) {
					
					myReservations[l]=Reserves2[l];
				}
				
				
		for(int removed=i;removed<Reserves2.length-1;removed++) {
			
			try {
				
			this.myReservations[removed]=Reserves2[i+1];
			
			}
			
			catch(Exception e) {
	        	
	        	e.printStackTrace();
	        }
			
			}
				
		return true;
			}			
		
		}    
		
		return false;
	  }
	
	public void clear() {
		
		myReservations=new Reservation[0];
	}
	
	public int getNumOfReservations() {
		
		return myReservations.length;
	}
	
	
	public int getTotalCost() {
		
		int Total=0;
		
		for(int i=0;i<myReservations.length;i++) {
			
			Total+=myReservations[i].getCost();
		}
		
		return Total;
		
	}
	

	
}
