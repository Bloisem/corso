package cartoleria;

public class Penna extends Articolo{
	private String colore;

	public Penna(String marca, String modello, double costo, String colore) {
		super(marca, modello, costo);
		this.colore=colore;
		this.setPrezzo(costo*3);
	}

	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	


	@Override
	public String toString() {		
		StringBuilder builder = new StringBuilder();
		{
			builder.append("Penna [marca=");
			builder.append(this.getMarca());
			builder.append(", modello=");
			builder.append(this.getModello());
			builder.append(", costo=");
			builder.append(this.getCosto());
			builder.append(", colore=");
			builder.append(colore);
			builder.append(", prezzo=");
			builder.append(this.getPrezzo());
			builder.append("]");
			return builder.toString();
		}
		
	}

	
}
