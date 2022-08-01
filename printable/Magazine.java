package printable;

public class Magazine implements Printable {
	private String name;
	private int number;

	public Magazine(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public Magazine() {

	}

	@Override
	public void print() {
		System.out.println("Print magazine: " + name + " " + "N. " + number);
	}

	public void printMagazines(Printable[] printable) {
		System.out.println(name);
	}

}
