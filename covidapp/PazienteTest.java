package covidapp;

import java.util.Scanner;

public class PazienteTest {
	public static void main(String[] args) {

		int senzaSintomiCount = 0;
		int conSintomiCount = 0;

		// dati input
		System.out.println("Numero di pazienti: ");
		int numeroPazienti = new Scanner(System.in).nextInt();
		Paziente[] conSintomi = new Paziente[numeroPazienti];
		Paziente[] senzaSintomi = new Paziente[numeroPazienti];

		for (int i = 0; i < numeroPazienti; i++) {
			// presentazione
			System.out.println("Paziente " + (i + 1));
			Paziente paziente = new Paziente();

			System.out.println("Nome: ");
			paziente.setNome(new Scanner(System.in).nextLine());
			System.out.println("Cognome: ");
			paziente.setCognome(new Scanner(System.in).nextLine());
			System.out.println("Età: ");
			paziente.setEta(new Scanner(System.in).nextInt());
			System.out.println("Paziente " + (i + 1) + " " + paziente.datiAnagrafici(paziente));

			// sintomi
			System.out.println("Sintomi");
			System.out.println("La temperatura è: ");
			paziente.setTemperatura(new Scanner(System.in).nextDouble());
			System.out.println("Sulle prossime domande rispondi true o false");
			System.out.println();
			System.out.println("Ha la tosse?");
			paziente.setTosse(new Scanner(System.in).nextBoolean());
			System.out.println("Stanghezza?");
			paziente.setStanghezza(new Scanner(System.in).nextBoolean());
			System.out.println("Ha la dificoltà respiratoria?");
			paziente.setDifficoltaRespiratoria(new Scanner(System.in).nextBoolean());

			// elaborazione dei dati
			if (paziente.diagnosi(paziente)) {
				conSintomi[conSintomiCount] = paziente;
				conSintomiCount++;
			} else {
				senzaSintomi[senzaSintomiCount] = paziente;
				senzaSintomiCount++;
			}

		}
		System.out.println();
		// Output risultato
		System.out.println(" Lista delle persone che devono essere ricoverati:");
		for (int i = 0; i < conSintomiCount; i++) {
			System.out.println((i + 1) + ". " + conSintomi[i].getNome() + " " + conSintomi[i].getCognome());
		}
		System.out.println(" Lista delle persone che devono fare il tampone:");
		for (int i = 0; i < senzaSintomiCount; i++) {
			System.out.println((i + 1) + ". " + senzaSintomi[i].getNome() + " " + senzaSintomi[i].getCognome());
		}
	}
}
