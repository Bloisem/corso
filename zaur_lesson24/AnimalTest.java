package zaur_lesson24;

public class AnimalTest {

	public static void main(String[] args) {
		Swordsman fish = new Swordsman("Гарри");
		fish.eat();
		fish.sleep();
		fish.swim();
		Speakable penguin = new Penguin("Петя");
		penguin.speak();
		Animal leon= new Leon("Лео");
		leon.eat();
		leon.getName();
		leon.sleep();
		Mammal leon2 = new Leon("Ричард");
		leon2.eat();
		leon2.run();
		leon2.sleep();
		leon2.speak();

	}

}
