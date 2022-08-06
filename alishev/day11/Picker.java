package alishev.day11;

public class Picker extends Person implements Worker {
	private double salary;
	private Warehouse warehouse;
	private int order;

	public double getSalary() {
		return salary;
	}

	public Picker(String fullName, Warehouse warehouse) {
		super(fullName);
		this.warehouse = warehouse;

	}

	@Override
	public void doWork() {
		this.salary += 80;
		warehouse.setCountOrder(warehouse.getCountOrder() + 1);
		order++;
		if (order >= 1500) {
			bonus();
		}

	}

	@Override
	public void bonus() {

		salary *= 3;
		System.out.println(getFullName() + ", salary: " + salary);
		order = 0;

	}

}
