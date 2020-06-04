


public class Room {
	
	private String Roomtype;
	private int Roomprice;
	private boolean AvaiableRoom;
	
	
   	
	public Room(String Roomtype){
		
	
		
		if(Roomtype.equalsIgnoreCase("king")||Roomtype.equalsIgnoreCase("queen")||Roomtype.equalsIgnoreCase("double")) {	
		
			this.Roomtype=Roomtype;
			
		}
				
           
	    if (!Roomtype.equalsIgnoreCase("king")&&!Roomtype.equalsIgnoreCase("queen")&&!Roomtype.equalsIgnoreCase("double")) {
			
			throw new IllegalArgumentException("No such Roomtype can be created");
					
		}
	    
	    if(Roomtype.equalsIgnoreCase("queen")) {
	    	
	    	Roomprice=11000;
	    		
	    }
	    
	    if(Roomtype.equalsIgnoreCase("king")) {
	    	
	    	Roomprice=15000;
	    }
	    
         if(Roomtype.equalsIgnoreCase("double")) {
	    	
	    	Roomprice=9000;
	    }
		
        AvaiableRoom=true;
     		
	}
	
	
	

	
	public Room(Room r) {
		
	this.Roomprice=r.Roomprice;
	this.Roomtype=r.Roomtype;
	this.AvaiableRoom=r.AvaiableRoom;
	
		
	}
	
	
	public int getPrice() {
		
		return this.Roomprice;
	}
	
	
	public String getType() {
		
		return this.Roomtype;
	}
	
	public void changeAvailability() {
		
		AvaiableRoom=!AvaiableRoom;
		
		
	}
	
	
	public static Room findAvailableRoom(Room[] RoomArray, String Roomtype) {
		
		for(Room r:RoomArray) {
			
			if(r.AvaiableRoom == true && r.Roomtype.equalsIgnoreCase(Roomtype))
				
				try {
				
				return r;
				
				}
			
			catch(Exception e) {
	        	
	        	e.printStackTrace();
	        }
				
		}
		
		return null;	
}	

	
public static boolean makeRoomAvailable(Room[] RoomArray, String Roomtype) {
	
		

		for (Room r : RoomArray) {
			
			if(r.AvaiableRoom == false && r.Roomtype.equalsIgnoreCase(Roomtype)){   
				
				try {
			    r.changeAvailability();
			    
				}
				
				catch(Exception e) {
		        	
		        	e.printStackTrace();
		        }
			    
			   return true;
		}
			
			
					 
}
		return false;
	   

}



}














	





		
				
  




   
		
	