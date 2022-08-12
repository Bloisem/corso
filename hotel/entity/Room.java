package hotel.entity;

public class Room {
	private int roomNumber;
	private int numberPerson;
	private double price;
	private boolean isAvailable;
	
	public Room(int roomNumber, int numberPerson, double price, boolean isAvailable) {
		super();
		this.roomNumber = roomNumber;
		this.numberPerson = numberPerson;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getNumberPerson() {
		return numberPerson;
	}

	public void setNumberPerson(int numberPerson) {
		this.numberPerson = numberPerson;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
