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
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
}
