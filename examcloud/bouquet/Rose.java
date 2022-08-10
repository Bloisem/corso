package examcloud.bouquet;

public class Rose extends Flower {
	private String color;

	public Rose(String country, int days, double price, String color) {
		super(country, days, price);
		this.color = color;
	}

}
