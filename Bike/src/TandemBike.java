
public class TandemBike extends BiCycle {

	public void driver() {
		System.out.println("Driver");
		
	}
	
	public void Pillion () {
		
		System.out.println("Pillion");
	}
	
	public void HandleBar1() {
		
		System.out.println("Set of Driver Handle Bar ");
	}
	
	public void HandleBar2() {
		
		System.out.println("Set of Pillion Handle Bar ");
	}
	
	public static void main(String[] args) {
	
		TandemBike TB = new TandemBike();
		
		TB.driver();
		TB.Pillion();
		TB.HandleBar1();
		TB.HandleBar2();
		TB.maxspeed();
		TB.maxrpm();
		TB.maxgear();
		 

	}

}
