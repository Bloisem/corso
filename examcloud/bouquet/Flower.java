package examcloud.bouquet;

public class Flower {
	static private int soldFlower;
	private String country;
	private int days;
	private double price;

	public Flower(String country, int days, double price) {
		this.country = country;
		this.days = days;
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getSoldFlower() {
		return soldFlower;
	}

	public static void setSoldFlower(int soldFlower) {
		Flower.soldFlower = soldFlower;
	}

}
