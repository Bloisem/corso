package zaur_lesson24;

public abstract class Bird extends Animal implements Speakable{

	public Bird(String name) {
		super(name);
		
	}
	
 public abstract void fly();

@Override
public void speak() {
	System.out.println(getName()+"sings");
}

 
}
