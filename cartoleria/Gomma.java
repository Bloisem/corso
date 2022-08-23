package cartoleria;

public class Gomma extends Articolo {
	private String dimensione;
	private String forma;
	

	public Gomma(String marca, String modello, double costo, String dimensione, String forma) {
		super(marca, modello, costo);
		this.setPrezzo(costo * 2);
		this.dimensione = dimensione;
		this.forma = forma;

	}

	public String getDimensione() {
		return dimensione;
	}

	public String getForma() {
		return forma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		{
			builder.append("Gomma [marca=");
			builder.append(this.getMarca());
			builder.append(", modello=");
			builder.append(this.getModello());
			builder.append(", costo=");
			builder.append(this.getPrezzo());
			builder.append("dimensione=");
			builder.append(dimensione);
			builder.append(", forma=");
			builder.append(forma);
			builder.append(", prezzo=");
			builder.append(this.getPrezzo());
			builder.append("]");
			return builder.toString();
		}
	}
}
