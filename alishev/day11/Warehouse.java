package alishev.day11;

public class Warehouse {
	private String name;
	private int countOrder;
	private double balance;

	public Warehouse(String name) {
		this.name = name;
	}

	public Warehouse() {
	}

	// setter getter
	public int getCountOrder() {
		return countOrder;
	}

	public void setCountOrder(int countOrder) {
		this.countOrder = countOrder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Warehouse " + name + ": balance " + balance + ", made " + countOrder + " orders";
	}

}
