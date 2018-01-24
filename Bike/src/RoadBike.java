
public class RoadBike extends BiCycle {

	public void dropHandleBar() {
		
		System.out.println("Move the Handle Bar");
	}
	
	public static void main(String[] args) {
		
RoadBike RB = new RoadBike();
 RB.dropHandleBar();
 
 RB.maxspeed();
 RB.maxrpm();
 RB.maxgear();
 
	}

}
