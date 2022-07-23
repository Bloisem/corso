package oop;

public class Person {
	private String fullName;
	private int age;
	
	
	//costruttori
	Person() {		
	}
	Person(String fullName, int age) {		
		this.fullName = fullName;
		this.age = age;
	}
	
	
	//getter, setter
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//metods
	public void move() {
		System.out.println("Move: " + fullName);
	}
	
	
	public void talk() {
		System.out.println("Talk: " + fullName);
	};
	
	@Override
	public String toString() {
		String result =fullName +", age: " +age;
		return result;
	}

}
