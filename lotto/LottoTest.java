package lotto;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanti numeri vuio puntare, inserisci la cifra tra 5 e 10");
		int quantitaNumeri;
		while (true) {
			quantitaNumeri = sc.nextInt();
			if (quantitaNumeri < 5 || quantitaNumeri > 10) {
				System.out.println("Inserisci la cifra tra 5 e 10");
			} else {
				break;
			}
		}

		int[] numeriUtente = new int[quantitaNumeri];

		int j = 0;
		while (j != quantitaNumeri) {
			boolean isRepeat = false;
			System.out.println("Inserisci numero da 1 a 90");
			int singoloNumeroUtente = sc.nextInt();

			// se 0 < numero < 90
			if (singoloNumeroUtente < 0 || singoloNumeroUtente > 90) {
				System.out.println("Errore... Inserisci un numero da 1 a 90! ");
				continue;
			}

			for (int i = 0; i <= j; i++) {
				if (numeriUtente[i] == singoloNumeroUtente) {
					isRepeat = true;
					break;
				}
			}

			if (!isRepeat) {
				numeriUtente[j] = singoloNumeroUtente;
				j++;

			}
		}
		System.out.println("I numeri del giocatore sono: ");
		if (j == quantitaNumeri) {
			for (int i = 0; i < quantitaNumeri; i++) {
				System.out.print(numeriUtente[i] + " ");

			}
		}

		int[] numeriLotto = lotto.generaNumeriLotto();
		System.out.println();
		System.out.println("I numeri del lotto sono: ");
		System.out.println(lotto.controllaVincita(numeriUtente, numeriLotto));

		sc.close();

	}
}
