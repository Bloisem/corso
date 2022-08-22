package azienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Azienda {
	private String ragioneSociale;
	private String partitaIva;
	private int capitaleSociale;
	private int numeroImpiegati;
	private Impiegato[] listaImpiegati = new Impiegato[30];

	public Azienda(String ragioneSociale, String partitaIva, int capitaleSociale, File file) {
		this.ragioneSociale = ragioneSociale;
		this.partitaIva = partitaIva;
		this.capitaleSociale = capitaleSociale;
		this.listaImpiegati = new Impiegato[100];
		aggiungiImpiegato(file);

	}
	// getter setter

	public int getNumeroImpiegati() {
		return numeroImpiegati;
	}

	public void setNumeroImpiegati(int numeroImpiegati) {
		this.numeroImpiegati = numeroImpiegati;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public int getCapitaleSociale() {
		return capitaleSociale;
	}

	public void setCapitaleSociale(int capitaleSociale) {
		this.capitaleSociale = capitaleSociale;
	}

	// funzionalita
	public void funzionalita(int a) {
		switch (a) {
		case 1:
			System.out.println(this);
			break;
		case 2:
			aggiungiImpiegato();
			break;
		case 3:
			eliminaImpiegato();
			break;
		case 4:
			System.out.println(Arrays.toString(Arrays.copyOf(listaImpiegati, numeroImpiegati)));
			break;
		case 5:
			aumentareCapitale();
			break;
		case 6:
			diminuireCapitale();
			break;
		}

	}

	private Impiegato[] aggiungiImpiegato(File file) {
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] impiegato = sc.nextLine().split(" ");
				Impiegato impiegato1 = new Impiegato(impiegato[0], impiegato[1], impiegato[2]);
				listaImpiegati[numeroImpiegati] = impiegato1;
				numeroImpiegati++;
			}
			System.out.println("Impiegati dal file sono stati aggiunti alla lista");
			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");

		}
		return listaImpiegati;
	}

	private void aggiungiImpiegato() {
		System.out.println("Aggiungi un nuovo impiegato: nome, cognome, codice fiscale ");
		String[] impiegato = new Scanner(System.in).nextLine().split(" ");
		Impiegato impiegato1 = new Impiegato(impiegato[0], impiegato[1], impiegato[2]);
		listaImpiegati[numeroImpiegati++] = impiegato1;
		System.out.println(impiegato[0] + " " + impiegato[1] + " è stato aggiunto alla lista");
	}

	private void eliminaImpiegato() {
		System.out.println("Aggiungi il codice fiscale dell'impiegato da eliminare: ");
		String codiceFiscale = new Scanner(System.in).nextLine();
		Impiegato[] listaImpiegatiResult = new Impiegato[numeroImpiegati];
		int count = 0;
		for (int i = 0; i < numeroImpiegati; i++) {
			if (listaImpiegati[i].getCodiceFiscale().equals(codiceFiscale)) {
				System.out.println(listaImpiegati[i].getNome() + " " + listaImpiegati[i].getCognome()
						+ " è stato eliminato dalla lista");

			} else {
				listaImpiegatiResult[count++] = listaImpiegati[i];
			}
		}
		if(numeroImpiegati==count) {
			System.out.println("Codice fiscale non è presente nella lista");
		}
		else {
			numeroImpiegati=count;
			listaImpiegati = listaImpiegatiResult;
		}

	}

	private void aumentareCapitale() {
		System.out.println("Inserisci la somma di aumento : ");
		int somma = new Scanner(System.in).nextInt();
		capitaleSociale += somma;
		System.out.println("Il capitale è " + this.capitaleSociale);
	}

	private void diminuireCapitale() {
		System.out.println("Inserisci la somma di diminuzione : ");
		int somma = new Scanner(System.in).nextInt();
		capitaleSociale -= somma;
		System.out.println("Il capitale è " + this.capitaleSociale);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Azienda [ragioneSociale=");
		builder.append(ragioneSociale);
		builder.append(", partitaIva=");
		builder.append(partitaIva);
		builder.append(", capitaleSociale=");
		builder.append(capitaleSociale);
		builder.append(", numeroImpiegati=");
		builder.append(numeroImpiegati);
		builder.append("]");
		return builder.toString();
	}

}
