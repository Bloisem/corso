package cartoleria;

public abstract class Articolo {
	private String marca;
	private String modello;
	private double costo;
	private double prezzo;
	//costruttore
	public Articolo(String marca, String modello, double costo) {
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;		
	}
	//getter
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public double getCosto() {
		return costo;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
