package zaur_lesson24;

public class Leon extends Mammal{

	public Leon(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		System.out.println("Лев быстро бегает");
		
		
	}

	@Override
	public void eat() {
		System.out.println("Лев любит мясо");
		
	}

	@Override
	public void sleep() {
		System.out.println("Лев спит большую часть дня");
		
	}

}
