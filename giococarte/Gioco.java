package giococarte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gioco {

	private Giocatore giocatore1;
	private Giocatore giocatore2;
	private List<Carta> mazzoCarte = new ArrayList<>();

	public Gioco(Giocatore giocatore1, Giocatore giocatore2) {
		this.giocatore1 = giocatore1;
		this.giocatore2 = giocatore2;
		creaMazzoCarte();
	}

	// getter setter
	public Giocatore getGiocatore1() {
		return giocatore1;
	}

	public void setGiocatore1(Giocatore giocatore1) {
		this.giocatore1 = giocatore1;
	}

	public Giocatore getGiocatore2() {
		return giocatore2;
	}

	public void setGiocatore2(Giocatore giocatore2) {
		this.giocatore2 = giocatore2;
	}

	public void estrareCarte(int numeroMani) {
		int count = 0;
		while (count < numeroMani) {
			for (int i = 0; i < mazzoCarte.size() - 1; i += 2) {
				if (count == numeroMani) {
					break;
				}
				System.out.println("\nLa prova numero: " + (++count));
				if (mazzoCarte.get(i).getValoreCarta().ordinal() == mazzoCarte.get(i + 1).getValoreCarta().ordinal()) {
					if (mazzoCarte.get(i).getSemeCarta().ordinal() > mazzoCarte.get(i + 1).getSemeCarta().ordinal()) {
						stampaRisultato(i, giocatore1);
						giocatore1.setPunteggio(giocatore1.getPunteggio() + 1);

					} else {
						stampaRisultato(i, giocatore2);
						giocatore2.setPunteggio(giocatore2.getPunteggio() + 1);

					}
				} else {
					if (mazzoCarte.get(i).getValoreCarta().ordinal() > mazzoCarte.get(i + 1).getValoreCarta()
							.ordinal()) {
						stampaRisultato(i, giocatore1);
						giocatore1.setPunteggio(giocatore1.getPunteggio() + 1);

					} else {
						stampaRisultato(i, giocatore2);
						giocatore2.setPunteggio(giocatore2.getPunteggio() + 1);

					}
				}
				stampaTotale();
			}
			mischiaMazzo();			
		}
		verificaVincitore();
	}

	// metodi privati
	private void creaMazzoCarte() {
		SemeCarta[] SemeCartaArray = SemeCarta.values();
		ValoreCarta[] valoreCartaArray = ValoreCarta.values();
		for (int i = 0; i < SemeCartaArray.length; i++) {
			for (int j = 0; j < valoreCartaArray.length; j++) {
				mazzoCarte.add(new Carta(SemeCartaArray[i], valoreCartaArray[j]));
			}

		}
		mischiaMazzo();

	}

	private void mischiaMazzo() {
		Collections.shuffle(mazzoCarte);
	}

	private void stampaRisultato(int i, Giocatore giocatore) {
		System.out.println(giocatore1.getName() + " ha estrato " + mazzoCarte.get(i));
		System.out.println(giocatore2.getName() + " ha estrato " + mazzoCarte.get(i + 1));
		System.out.println("1 punto va a " + giocatore.getName());
	}

	private void stampaTotale() {
		System.out.println(giocatore1);
		System.out.println(giocatore2);
	}

	private void verificaVincitore() {
		if (giocatore1.getPunteggio() == giocatore2.getPunteggio()) {
			System.out.println("\nPareggio");
		} else if (giocatore1.getPunteggio() > giocatore2.getPunteggio()) {
			System.out.println(
					"\nIl gioco ha vinto " + giocatore1.getName() + " con i " + giocatore1.getPunteggio() + " punti");
		} else {
			System.out.println(
					"\nIl gioco ha vinto " + giocatore2.getName() + " con i " + giocatore2.getPunteggio() + " punti");
		}
	}

}
