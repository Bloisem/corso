package giorno_uno;

import java.util.Scanner;

public class TestEsercizioTre {

	public static void main(String[] args) {
		// import classi
		Scanner sc = new Scanner(System.in);
		NumeriPrimi esercizioTre = new NumeriPrimi();
		

		// input
		System.out.println("Inserisci il numero: ");
		int num = sc.nextInt();
		
		esercizioTre.setNumeroInserito(num);
		
		System.out.println(esercizioTre.verificaNumeroPrimo());

		

	}

}
