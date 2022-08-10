package harb.inheritance;

public class Cylinder extends SolidOfRevolution {
	private double height;
	private double radius;

	public Cylinder(double radius, double height) {
		super((Math.PI * radius * radius * height), radius);
		this.radius = radius;
		this.height = height;

	}

}
