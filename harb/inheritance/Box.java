package harb.inheritance;

public class Box extends Shape {

	public Box(double volume) {
		super(volume);

	}

	public boolean add(Shape a) {
		if (this.getVolume() - a.getVolume() > 0) {
			this.setVolume(this.getVolume() - a.getVolume());
			System.out.println("Shape in the box");
			return true;
		} else {
			System.out.println("The space in the box is finished");

			return false;
		}
	}

}
