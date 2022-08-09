package zaur_lesson24;

public interface Speakable {
	public default void speak() {
		System.out.println("Кто то говорит");
	}

}
