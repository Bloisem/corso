package harb.inheritance;

//https://habr.com/ru/post/440436/
public class ShapeTest {
	public static void main(String[] args) {
		Box someBox = new Box(100);
		Cylinder cylinder = new Cylinder(2, 3);
		SolidOfRevolution ball = new Ball(2.5);
		someBox.add(ball);
		someBox.add(cylinder);
		SquarePyramid pyramid = new SquarePyramid(3.5, 6.0);
		someBox.add(pyramid);
		someBox.add(pyramid);
		someBox.add(cylinder);

	}
}