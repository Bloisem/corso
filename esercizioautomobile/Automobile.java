package esercizioautomobile;

public class Automobile {
	private String marca;
	private String modello;
	private int prezzo;

	public Automobile(String marca, String modello, int prezzo) {
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}

	public Automobile() {

	}

	public void setMarca(String m) {
		marca = m;
	}

	public String getMarca() {
		return marca;
	}

	public void setModello(String n) {
		modello = n;

	}

	public String getModello() {
		return modello;
	}

	public void setPrezzo(int p) {
		prezzo = p;

	}

	public int getPrezzo() {
		return prezzo;
	}

	public String toString() {
		String str = marca + " " + modello +": "+ "prezzo " + prezzo;
		return str;
	}
	public String differenzaPrezzo(int a) {
		
		int i = 0;
		i = a-prezzo;
		String	str = "La differenza é : " +i; 
		
		return str;
	}
}