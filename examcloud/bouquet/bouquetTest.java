package examcloud.bouquet;

public class bouquetTest {
	public static void main(String[] args) {

		Flower roseWhite = new Rose("Spain", 10, 5.0, "white");
		Flower roseOrange = new Rose("Spain", 10, 5.5, "orange");
		Flower roseYellow = new Rose("Spain", 10, 5.0, "yellow");
		Flower peonySmall = new Peony("Netherlands", 10, 3.0, "small");
		Flower limoniumWhite = new Limonium("Netherlands", 10, 2.5, "white");
		Flower limoniumPink = new Limonium("Netherlands", 10, 2.6, "pink");
		Flower limoniumGreeen = new Limonium("Netherlands", 10, 2.4, "green");

		CreateBouquet one = new CreateBouquet(limoniumGreeen, peonySmall, peonySmall, peonySmall, peonySmall,
				limoniumGreeen, limoniumGreeen, roseWhite, peonySmall, roseWhite, roseWhite, roseWhite, roseWhite,
				limoniumGreeen, limoniumGreeen);
		CreateBouquet two = new CreateBouquet(roseWhite, roseWhite, roseWhite, roseWhite, roseWhite, roseWhite,
				roseWhite, peonySmall, peonySmall, peonySmall, peonySmall, peonySmall, peonySmall, peonySmall,
				peonySmall, peonySmall, limoniumWhite, limoniumWhite, limoniumWhite, limoniumWhite, limoniumWhite);

		one.bouquetInfo();
		System.out.println("Sold " + Flower.getSoldFlower() + " flowers");
		two.bouquetInfo();
		System.out.println("Sold " + Flower.getSoldFlower() + " flowers");

	}
}
