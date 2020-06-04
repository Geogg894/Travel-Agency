


public class Airport {
	
	private int x;
	private int y;
	private int cents;
	
	public Airport(int x,int y, int cents) {
		
	this.x=x;
    this.y=y;
    this.cents=cents;
		
	}
	
	public int getFees() {
		
		return cents;
	}
	
	
	
	public static int getDistance(Airport A1,Airport A2) {
		
		
				
		int distance= (int)Math.ceil(Math.sqrt((Math.pow(A2.x-A1.x, 2)+(Math.pow(A2.y-A1.y, 2))))); 
	
		return distance;
		
	}
}

