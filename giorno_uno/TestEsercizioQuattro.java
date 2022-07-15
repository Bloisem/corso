package giorno_uno;

import java.util.Scanner;

public class TestEsercizioQuattro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// import classi
		Scanner sc = new Scanner(System.in);
		NumeriPrimi esercizioQuattro = new NumeriPrimi();
		
		System.out.println("Inserisci il numero: ");
		int num = sc.nextInt();
		esercizioQuattro.setNumeroInserito(num);
		
		String result = esercizioQuattro.divisoriPositivi();
		System.out.println(result);
		
		
		

	}

}
