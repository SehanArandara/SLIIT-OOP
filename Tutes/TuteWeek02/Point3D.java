package TuteWeek2;

public class Point3D {
	private int x;
	private int y;
	private int z;
	
	// overload constructor
	Point3D(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double distance() {
		return Math.sqrt((x*x)+(y*y)+(z*z));
	}
}
