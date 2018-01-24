
public class MountainBike extends BiCycle {

	public void ChainRings() {
		System.out.println("Add some more Chain Rings");
		
	}
	
	public static void main(String[] args) {
		
       MountainBike MB = new MountainBike();
       
       MB.ChainRings();
       
       MB.maxspeed();
       MB.maxrpm();
       MB.maxgear();
	}

}
