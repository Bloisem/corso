package printable;

public class PrintTest {

	public static void main(String[] args) {
		Book bookOne = new Book("Deep Work", "Cal Newport");
		Book bookTwo = new Book("Digital Minimalism", "Cal Newport");
		Magazine magazineOne = new Magazine("Vogue", 1);
		Magazine magazineTwo = new Magazine("Elle", 3);
		Printable[] printable = { bookOne, bookTwo, magazineOne, magazineTwo };

		for (Printable pr : printable) {
			pr.print();

		}

	}

}
