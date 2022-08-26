package giococarte;

import java.util.Scanner;

public class GiocoCarteTest {

	public static void main(String[] args) {
		Giocatore giocatore1 = new Giocatore("Mumin");
		Giocatore giocatore2 = new Giocatore("Topomuschiato");
		Gioco gioco1 = new Gioco(giocatore1, giocatore2);
		System.out.println("Quandi mani vuoi giocare ?");
		gioco1.estrareCarte(new Scanner(System.in).nextInt());

	}

}
