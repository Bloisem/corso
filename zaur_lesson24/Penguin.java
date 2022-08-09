package zaur_lesson24;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
		
	}

	@Override
	public void fly() {
		System.out.println("Пингвин не умеет летать");
		
	}

	@Override
	public void eat() {
		System.out.println("Пингвин ест рыбу");
		
	}

	@Override
	public void sleep() {
		System.out.println("Пингвин спят прижавшись друг к другу");
		
	}

	@Override
	public void speak() {
		System.out.println("Пингвин не умеют петь как соловей");
		
	}

}
