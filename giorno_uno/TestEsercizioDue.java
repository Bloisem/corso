package giorno_uno;

import java.util.Scanner;

public class TestEsercizioDue {

	public static void main(String[] args) {
		// import classi
		Scanner sc = new Scanner(System.in);
		OperazioniMath esercizioDue = new OperazioniMath();

		// input

		StringBuilder temp = new StringBuilder();

		while (true) {
			System.out.println("Inserisci numero da elaborare. Per terminare inserisci 0! ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			temp.append(num).append(" ");
		}
		String[] stringArrayNumbers = temp.toString().split(" ");

		// elaborazione
		int[] numbers = esercizioDue.strArrayToIntArray(stringArrayNumbers);
		esercizioDue.setNumeroToArray(numbers);
		int somma = esercizioDue.somma();
		double media = esercizioDue.media();
		long prodotto = esercizioDue.prodotto();
		int minore = esercizioDue.minore();
		int maggiore = esercizioDue.maggiore();

		// console
		System.out.println("La somma é: " + somma);
		System.out.println("La media é: " + media);
		System.out.println("Il prodotto é: " + prodotto);
		System.out.println("Il numero minore è: " + minore);
		System.out.println("Il numero maggiore è: " + maggiore);
		sc.close();

		sc.close();

	}

}
