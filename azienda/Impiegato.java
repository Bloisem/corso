package azienda;

public class Impiegato {
	private String nome;
	private String cognome;
	private String codiceFiscale;

	public Impiegato(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}

	// getter, setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Impiegato [nome = ");
		builder.append(nome);
		builder.append(", cognome = ");
		builder.append(cognome);
		builder.append(", codice fiscale = ");
		builder.append(codiceFiscale);
		builder.append("]");
		return builder.toString();
	}

}
