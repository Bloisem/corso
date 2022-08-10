package harb.inheritance;

public class Ball extends SolidOfRevolution {
	private double radius;

	public Ball(double radius) {
		super((4 / 3 * (Math.PI * Math.pow(radius, 3))), radius);
		this.radius = radius;

	}

}
