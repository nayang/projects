/* student name: Na Yang
 * student number:040744984
 * class section:353
 */	
public class Cylinder {
	private double cylinderRadius;
	private double cylinderHeight;
	
	
	public Cylinder() {}


	public Cylinder(double cylinderHeight, double cylinderRadius) {
		this.cylinderRadius = cylinderRadius;
		this.cylinderHeight = cylinderHeight;
	}


	public double getCylinderRadius() {
		return cylinderRadius;
	}


	public void setCylinderRadius(double cylinderRadius) {
		this.cylinderRadius = cylinderRadius;
	}


	public double getCylinderHeight() {
		return cylinderHeight;
	}


	public void setCylinderHeight(double cylinderHeight) {
		this.cylinderHeight = cylinderHeight;
	}
	
	public double calculateCylinderVolume() {
		return Math.PI*Math.pow(cylinderRadius, 2)*cylinderHeight;
		
	}
	
}
