package socialnetwork;

import java.util.Comparator;
import java.util.List;

public class SocialNetworkTest {

	public static void main(String[] args) {
		SocialNetworkFunction network1 = new SocialNetworkFunction();
		Persona persona1 = new Persona("Liudmyla", "Stor", 1988, 2, 14, Sesso.F, Nazionalita.STRANIERA);
		Persona persona2 = new Persona("Francesco", "Conte", 1988, 8, 30, Sesso.M, Nazionalita.ITALIANA);
		Persona persona3 = new Persona("Pavlo", "Tsukur", 1992, 03, 06, Sesso.M, Nazionalita.STRANIERA);
		Persona persona4 = new Persona("Miriam", "Leone", 2013, 11, 1, Sesso.F, Nazionalita.ITALIANA);
		Persona persona5 = new Persona("Mila", "Taylor", 1986, 3, 06, Sesso.F, Nazionalita.ITALIANA);
		Persona persona6 = new Persona("Anna", "Ferrari", 1995, 9, 06, Sesso.F, Nazionalita.ITALIANA);

		network1.addPersone(persona1, persona2, persona3, persona4, persona5, persona6);
		System.out.println("La differenza d'età " + (persona4.differenzaEta(persona1)) + " anni");
		System.out.println("La differenza d'età (static) " + Persona.differenzaEta(persona1, persona3) + " anni");
		System.out.println("Per il compleanno di " + persona4 + " mancano " + persona4.giorniMancanti() + " giorni");

		List<Persona> giovanniDonne = network1
				.filtraCriterio(p -> (p.getEta() >= 18) && (p.getEta() <= 29) && (p.getSesso().equals(Sesso.F)));
		network1.inviaMessaggio("Ciao", giovanniDonne);
		System.out.println("---------------------------------------------------------------");
		List<Persona> uominiStranieri = network1.filtraCriterioPredicate(network1::test);
		network1.inviaMessaggio("Hello ", uominiStranieri);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Ordina per nome");
		network1.getPersone().sort(Comparator.comparing(Persona::getNome));
		System.out.println(network1.getPersone());
		System.out.println("Ordina per cognome");
		network1.getPersone().sort(Comparator.comparing(Persona::getCognome));
		System.out.println(network1.getPersone());
		System.out.println("Ordina per età");
		network1.getPersone().sort(Comparator.comparing(Persona::getEta));
		System.out.println(network1.getPersone());

	}
}

/*
 * Sfruttando la classe Persona, che all'occorrenza sarà modificata aggiungendo
 * le caratteristiche sesso, età e nazionalità, implementare un SocialNetwork
 * italiano.
 * 
 * Il social prevederà la possibilità di inviare diversi messaggi agli utenti in
 * base a diversi criteri:
 * 
 * -uno indirizzato alle giovani donne (persone di sesso femminile di età
 * compresa tra i 18 e i 29 anni); -uno indirizzato a tutti gli iscritti di
 * sesso maschile; -uno indirizzato ai soli utenti di nazionalità estera.
 * 
 * Implementare la soluzione facendo uso di lambda e reference a metodi per
 * individuare il target di utenti del messaggio.
 * 
 * }
 */
