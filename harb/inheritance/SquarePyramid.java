package harb.inheritance;

public class SquarePyramid extends Shape {
	private double height;
	private double base;

	public SquarePyramid(double base, double height) {
		super(1 / 3 * height * base * base);
		this.height = height;
		this.base = base;
		// TODO Auto-generated constructor stub
	}

}
