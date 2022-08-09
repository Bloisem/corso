package zaur_lesson24;

public abstract class Animal {
	

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void eat();
	public abstract void sleep();


}
