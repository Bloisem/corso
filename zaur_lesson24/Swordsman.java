package zaur_lesson24;

public class Swordsman extends Fish{

	public Swordsman(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println("Меченосец быстро плавает");
		
	}

	@Override
	public void eat() {
		System.out.println("Меченосец ест корм");
		
	}
	

}
