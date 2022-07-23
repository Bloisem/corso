package oop;

public class Phone {
	private String number;
	private String model;
	private int weigth;
	
	
	
	
	Phone() {
		
	}
	
	Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}

	Phone(String model, String number, int weigth) {
		this(number,model);
		this.weigth = weigth;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	@Override
	public String toString() {
		String result = "Model: "+ model + ", weight: "+weigth;
		return result;
	}
	public String receiveCall(String name) {
		String result = "Call: "+ name;
		return result;
	}
	public String receiveCall(String name, String number) {
		String result = "Call: "+ name +" "+ number +";";
		return result;
	}
	public void sendMessage(String...numbers) {
		for(String i:numbers)
		System.out.println(i);
	}

}
