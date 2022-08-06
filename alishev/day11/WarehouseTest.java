package alishev.day11;

public class WarehouseTest {
	public static void main(String[] args) {
		Warehouse warehouse1 = new Warehouse("Amazon");
		Picker picker = new Picker("Dog Gerry", warehouse1);
		Courier courier = new Courier("Cat Garfield", warehouse1);

		for (int i = 0; i < 4000; i++) {
			picker.doWork();
			courier.doWork();
		}
		System.out.println(warehouse1);

		Warehouse warehouse2 = new Warehouse("Ebay");
		Picker picker2 = new Picker("Frog Green", warehouse2);
		Courier courier2 = new Courier("Fox Rex", warehouse2);

		for (int i = 0; i < 2000; i++) {
			picker2.doWork();
			courier2.doWork();
		}
		System.out.println(warehouse2);

	}

}
