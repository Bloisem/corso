package hotel.entity;

public class Client {
	private String name;
	private String surname;
	private String email;
	private String phone;
	private Bill bill;
	
	public Client(String name, String surname, String email, String phone, double bill) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.bill = new Bill(bill);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
	

}
