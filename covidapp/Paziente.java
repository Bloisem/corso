package covidapp;

public class Paziente {
	private boolean sintomi = false;

	private String nome;
	private String cognome;
	private int eta;
	private boolean tosse;
	private double temperatura;
	private boolean stanghezza;
	private boolean difficoltaRespiratoria;

	// get e set metodi per i dati anagrafici
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCognome(String m) {
		cognome = m;
	}

	public String getCognome() {
		return cognome;
	}

	public void setEta(int eta) {
		if (eta < 0 || eta > 130) {
			System.out.println("Errore... inserisci età");
		} else {
			this.eta = eta;
		}
	}

	public String datiAnagrafici(Paziente paziente) {
		String datiAnagraficiResult = paziente.nome + " " + paziente.cognome + ", " + paziente.eta + " anni.";
		return datiAnagraficiResult;
	}

	public void setTosse(boolean tosse) {
		this.tosse = tosse == true ? true : false;

	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;

	}

	public void setStanghezza(boolean stanghezza) {
		this.stanghezza = stanghezza == true ? true : false;
	}

	public void setDifficoltaRespiratoria(boolean difficoltaRespiratoria) {
		this.difficoltaRespiratoria = difficoltaRespiratoria == true ? true : false;
	}

	public boolean diagnosi(Paziente paziente) {
		String result = new String();
		result = (nome + " " + cognome);
		if (tosse == true && temperatura > 37.0 && stanghezza == true && difficoltaRespiratoria == true) {
			System.out.println(result + " dovrà essere recoverato!");
			sintomi = true;

		} else {
			System.out.println(result + " dovrà fare il tampone!");

		}
		return sintomi;
	}
}
