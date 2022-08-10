package examcloud.bouquet;

import java.util.ArrayList;

public class CreateBouquet {
	private ArrayList<Flower> bouquet = new ArrayList<>();
	private double price;

	public CreateBouquet(Flower... bouquet) {
		for (Flower f : bouquet) {
			this.bouquet.add(f);

		}

	}

	private double calcolatePrice() {

		for (Flower f : bouquet) {
			price += f.getPrice();
			Flower.setSoldFlower(Flower.getSoldFlower() + 1);
		}

		return price;
	}

	public void bouquetInfo() {
		int rose = 0;
		int peony = 0;
		int limonium = 0;

		for (Flower f : bouquet) {
			if (f instanceof Rose) {
				rose++;
			}
			if (f instanceof Peony) {
				peony++;
			}
			if (f instanceof Limonium) {
				limonium++;
			}

		}
		System.out.println("Bouquet with " + rose + " roses, " + peony + " peonies and " + limonium + " limonium costs "
				+ calcolatePrice() + " euro.");
	}

}
