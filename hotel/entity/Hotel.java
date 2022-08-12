package hotel.entity;

import java.util.Random;

public class Hotel {
	private String nameHotel;
	private Room[] hotelRooms;

	public Hotel(String nameHotel) {
		this.nameHotel = nameHotel;
		this.hotelRooms = createRoom();
	}

	private Room[] createRoom() {

		Random rand = new Random();
		int countRoom = rand.nextInt(5, 15);
		hotelRooms = new Room[countRoom];
		for (int i = 0; i < countRoom; i++) {
			int numberPerson = rand.nextInt(1, 5);
			double priceRoom = rand.nextDouble(25.0, 100.0);
			boolean isAvailable = rand.nextBoolean();
			Room oneRoom = new Room(i + 1, numberPerson, priceRoom, isAvailable);
			hotelRooms[i] = oneRoom;
		}

		return hotelRooms;
	}
	// setter, getter

	public Room[] getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(Room[] hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

	// public methods
	public void findRooms(int startCountPerson) {
		checkRooms(startCountPerson);
	}

	public void bookHotel(int startCountPerson, Client amount) {
		// check if rooms available
		if (checkRooms(startCountPerson)) {
			int countPerson = startCountPerson;
			double priceOccupiedRooms = 0;
			int occupiedRooms = 0;
			for (int i = 0; i < getHotelRooms().length; i++) {
				if (getHotelRooms()[i].isAvailable()) {
					countPerson = countPerson - getHotelRooms()[i].getNumberPerson();
					occupiedRooms++;
					priceOccupiedRooms += getHotelRooms()[i].getPrice();
					getHotelRooms()[i].setAvailable(false);
					if (countPerson <= 0) {
						if (checkupAmount(amount, priceOccupiedRooms)) {
							System.out.println("Insufficient funds in the bank account");
							break;
						}
						System.out.println("You booked " + occupiedRooms + " rooms for " + startCountPerson
								+ " persons , the price: " + priceOccupiedRooms + " euro");
						amount.getBill().setAmount(amount.getBill().getAmount() - priceOccupiedRooms);
						break;

					}

				}
			}

		}
	}

	// private help methods
	private boolean checkRooms(int startCountPerson) {
		int countPerson = startCountPerson;
		int occupiedRooms = 0;
		boolean result = false;
		double priceOccupiedRooms = 0;
		for (int i = 0; i < getHotelRooms().length; i++) {
			if (getHotelRooms()[i].isAvailable()) {
				countPerson = countPerson - getHotelRooms()[i].getNumberPerson();
				occupiedRooms++;
				priceOccupiedRooms += getHotelRooms()[i].getPrice();
				if (countPerson <= 0) {
					printRooms(true, occupiedRooms, startCountPerson, priceOccupiedRooms);
					result = true;
					return result;
				}

			}
		}
		System.out.println("Sorry, all rooms are occupied");
		return result;

	}

	private void printRooms(boolean isAvailable, int occupiedRooms, int startCountPerson, double priceOccupiedRooms) {
		if (isAvailable) {
			System.out.println("You can book " + occupiedRooms + " rooms for " + startCountPerson
					+ " persons , the price: " + priceOccupiedRooms + " euro");
		}
	}

	private boolean checkupAmount(Client amount, double priceOccupiedRooms) {

		return amount.getBill().getAmount() - priceOccupiedRooms < 0 ? true : false;
	}

}
