package azienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestAzienda {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("impiegati.txt");
		Azienda azienda = new Azienda("SNC", "PI1111111111", 100_000, file);

		while (true) {
			System.out.println("Inserischi: \n1- per stampare i dati dell'azienda; "
					+ "\n2- per aggiungere un impiegato; " + "\n3- per rimuovere un impiegato; "
					+ "\n4- per stampare la lista degli impiegati assunti;" + "\n5- per aumentare il capitale sociale;"
					+ "\n6- per diminuire il capitale sociale;" + "\n0- per uscire.");

			int numeroFunzionalita = new Scanner(System.in).nextInt();
			if (numeroFunzionalita == 0) {
				break;
			} else if (numeroFunzionalita < 0 || numeroFunzionalita > 6) {
				System.out.println("Il numero non è valido");
			} else {
				azienda.funzionalita(numeroFunzionalita);
			}

		}

	}

}

/*
 * Implementare una classe Azienda che contenga come campi: ragione sociale,
 * partita iva, capitale sociale e la lista degli impiegati.+ Utilizzare la
 * classe Impiegato. Per ogni campo scrivere i relativi metodi getter e setter.
 * Inoltre implementare un metodo per poter aggiungere un impiegato ed un metodo
 * per poter eliminare un impiegato. Scrivere altri due metodi uno per aumentare
 * il capitale sociale e l'altro per diminuire il valore del capitale sociale.
 * Testare la classe azienda implementando una classe TestAzienda contenente il
 * main. Si deve far visualizzare sulla console il seguente menu: -----------
 * Funzionalità: ---------- 1- per stampare i dati dell'azienda: 2- per
 * aggiungere un impiegato: 3- per rimuovere un impiegato: 4- per stampare la
 * lista degli impiegati assunti: 5- per aumentare il capitale sociale: 6- per
 * diminuire il capitale sociale: 0- per uscire Per ogni funzionalità fare la
 * relativa funzione.
 */
