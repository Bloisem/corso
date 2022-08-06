package alishev.day11;

public class Courier extends Person implements Worker {
	private double salary;
	private Warehouse warehouse;
	private double orderSum;

	public double getSalary() {
		return salary;
	}

	public Courier(String fullName, Warehouse warehouse) {
		super(fullName);
		this.warehouse = warehouse;
	}

	@Override
	public void doWork() {
		this.salary += 100;
		warehouse.setBalance(warehouse.getBalance() + 1000);
		orderSum += 1000;
		if (orderSum >= 1_000_000) {
			bonus();
		}

	}

	@Override
	public void bonus() {

		salary *= 2;
		System.out.println(getFullName() + ", salary: " + salary);
		orderSum = 0;

	}

}
