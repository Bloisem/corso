package oop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test for PHONE class
		Phone phoneUno = new Phone();
		phoneUno.setModel("Xiaomi");
		phoneUno.setNumber("345-144-14-23");
		phoneUno.setWeigth(196);
		Phone phoneDue = new Phone("Samsung", "365-148-78-32", 250);
		Phone phoneTre = new Phone("LG", "355-145-78-39", 195);
		
		System.out.println(phoneUno);
		System.out.println(phoneDue);
		System.out.println(phoneTre);
		
		System.out.println(phoneUno.receiveCall("Alex"));
		System.out.println(phoneUno.getNumber());
		
		System.out.println(phoneDue.receiveCall("Maria", phoneDue.getNumber()));
		System.out.println(phoneDue.getNumber());
		System.out.println(phoneTre.receiveCall("Paolo"));
		System.out.println(phoneTre.getNumber());
		
		phoneTre.sendMessage("123-145-26-35", "254-326-98-74");
		
		//Test Person
		Person personOne = new Person();
		personOne.setAge(35);
		personOne.setFullName("Mario Rossi");
		Person personTwo= new Person ("Maria Bianchi", 32);
		System.out.println(personOne);
		System.out.println(personTwo);

	}

}
