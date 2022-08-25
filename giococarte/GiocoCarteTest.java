package giococarte;

public class GiocoCarteTest {

	public static void main(String[] args) {
		Giocatore giocatore1 = new Giocatore("Topomuschiato");
		Giocatore giocatore2 = new Giocatore("Mumin");
		Gioco gioco1 = new Gioco(giocatore1, giocatore2);
		gioco1.estrareCarte();
		

	}

}
