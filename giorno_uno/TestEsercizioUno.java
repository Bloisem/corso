package giorno_uno;

import java.util.Scanner;

public class TestEsercizioUno {

	public static void main(String[] args) {
		//import classi
		Scanner sc = new Scanner(System.in);
		OperazioniMath primoEsercizio = new OperazioniMath();
		
		
		//inserire i numeri
		int countNumeri =3;
		primoEsercizio.setCountNumeri(countNumeri);
		int[] numbers= new int[countNumeri];
		
		for(int i = 0;i < countNumeri;i++ )
		{
			System.out.println("Inserisci numero:");
			numbers[i] = sc.nextInt();
		}
		primoEsercizio.setNumeroToArray(numbers);
		
		//elaborazione
		int somma = primoEsercizio.somma();
		double media = primoEsercizio.media();
		long prodotto = primoEsercizio.prodotto();
		int minore = primoEsercizio.minore();
		int maggiore = primoEsercizio.maggiore();
		
		
		//console
		System.out.println("La somma é: " + somma);
		System.out.println("La media é: "+ media);
		System.out.println("Il prodotto é: " + prodotto);
		System.out.println("Il numero minore è: " + minore);
		System.out.println("Il numero maggiore è: " + maggiore);
		sc.close();
	}

}
