package esercizioautomobile;

public class AutomobileTest {

	public static void main(String[] args) {
		
		Automobile fiesta = new Automobile();
		fiesta.setMarca("Ford");
		fiesta.setModello("Fiesta");
		fiesta.setPrezzo(15000);
		
		//System.out.println(fiesta.getMarca() + " "+fiesta.getModello() + " prezzo: " + fiesta.getPrezzo());
		
		Automobile juke = new Automobile("Juke", "Nissan", 25000);
		Automobile focus = new Automobile();
		
		focus.setModello("Focus");
		focus.setMarca("Ford");
		focus.setPrezzo(18000);
		
		
		
		//System.out.println(juke.getMarca() + " "+juke.getModello() + " prezzo: " + juke.getPrezzo());
		System.out.println(focus.toString());
		System.out.println(juke.toString());
		System.out.println(fiesta.toString());

	}

}
