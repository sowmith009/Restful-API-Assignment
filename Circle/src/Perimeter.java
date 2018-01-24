
public class Perimeter {
  private float Radius;
  private double Area;
   
  public Perimeter (float radius) {
	 
	Radius = radius; 
  }

public float getRadius() {
	return Radius;
}

public void setRadius(float radius) {
	Radius = radius;
}
  public void find_Area() {
	  Area = 3.14 * Radius * Radius;
	  System.out.println(+Area);
  }
 
  public float Diameter() {
	  float diameter = 2 * Radius;
			  return diameter;
	  
  }
  public double Circumference() {
	  double Circ = 2 * Radius * 3.14;
	  return Circ;
  }
}