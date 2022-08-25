package giococarte;

public class Giocatore {
	private String name;
	private int punteggio;

	public Giocatore(String name) {
		this.name = name;
		this.punteggio = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

}