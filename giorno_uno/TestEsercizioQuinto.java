package giorno_uno;

import java.util.Scanner;

public class TestEsercizioQuinto {

	public static void main(String[] args) {
		// import classi
		Scanner sc = new Scanner(System.in);
		NumeriPrimi esercizioQuinto = new NumeriPrimi();
		
		
		
		// TODO Auto-generated method stub
		System.out.println("Inserisci il numero: ");
		int num = sc.nextInt();
		
		esercizioQuinto.setNumeroInserito(num);
		System.out.println(esercizioQuinto.scomposizione());
			

	}

	}


