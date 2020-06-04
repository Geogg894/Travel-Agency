
public class Hotel {

		
	
	private String Hotel;
	private Room[] RoomArray;
	
	public Hotel(String Hotel, Room[] RoomArray) {
		

		Room[] RoomArray2=new Room[RoomArray.length];
		
	
		for(int i=0;i<RoomArray.length;i++)
			
			 {
				
				RoomArray2[i]=new Room(RoomArray[i]);
				
				
			}
		
		this.RoomArray= RoomArray2; 
				
	}
	
	public int reserveRoom(String Roomtype) {
		
		
				
				if(Room.findAvailableRoom(RoomArray, Roomtype)!=null) {  
					
					Room r=Room.findAvailableRoom(this.RoomArray, Roomtype);
					
					try {
					r.changeAvailability();
					return r.getPrice();
					
					}
					
					catch(Exception e) {
			        	
			        	e.printStackTrace();
			        }
					
					
			}
				
						
			throw new IllegalArgumentException("Operation was unsuccessful");
			    
	}	

	public boolean cancelRoom(String Roomtype) {
		
		return Room.makeRoomAvailable(RoomArray, Roomtype);
		
       }
	

    }