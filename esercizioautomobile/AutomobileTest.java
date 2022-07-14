package esercizioautomobile;

public class AutomobileTest {

	public static void main(String[] args) {
		
		Automobile fiesta = new Automobile();
		fiesta.setMarca("Ford");
		fiesta.setModello("Fiesta");
		fiesta.setPrezzo(15000);
		
		System.out.println(fiesta.getMarca() + " "+fiesta.getModello() + " prezzo: " + fiesta.getPrezzo());
		
		Automobile juke = new Automobile();
		juke.setModello("Juke");
		juke.setMarca("Nissan");
		juke.setPrezzo(23000);
		
		System.out.println(juke.getMarca() + " "+juke.getModello() + " prezzo: " + juke.getPrezzo());

	}

}
