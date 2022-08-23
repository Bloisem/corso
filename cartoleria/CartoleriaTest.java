package cartoleria;

public class CartoleriaTest {

	public static void main(String[] args) {
		Articolo penna1 = new Penna("Waterman", "sfera", 0.6, "blue");
		Articolo penna2 = new Penna("Mont", "stilografica", 0.8, "blue");
		Articolo penna3 = new Penna("Faber-Castell", "gel", 1.1, "nera");
		Articolo gomma1 = new Gomma("Staedtler", " per matita", 0.6, "65x21x12mm", "blocchetto");
		Articolo gomma2 = new Gomma("Pelikan", "gommapane", 0.7, "45x15x7mm", "blocco");
		Articolo gomma3 = new Gomma("Staedtler", "per penna", 0.8, "15x20x10mm", "animale");

		Magazzino magazzino1 = new Magazzino("Global");
		magazzino1.caricamentoArticoli(penna1, penna2, penna3, gomma3, gomma2, gomma1);
		magazzino1.articoliPresenti();
		magazzino1.stampaRicaviTotali();
		magazzino1.stampaCostiTotali();

		Magazzino magazzino2 = new Magazzino("Buffetti");
		magazzino2.caricamentoArticoli(penna3, gomma3, gomma2, gomma1);
		magazzino2.caricamentoArticoli(penna1);
		magazzino2.articoliPresenti();
		magazzino2.stampaRicaviTotali();
		magazzino2.stampaCostiTotali();

	}

}
/*
 * Una cartoleria richiede un programma per gestire la merce in magazzino. Gli
 * articoli che vengono trattati sono gomme e penne. Le penne sono
 * caratterizzate da: marca, modello, colore, costo e prezzo(uguale al triplo
 * del costo). Le gomme sono caratterizzate da: marca, modello, dimensione,
 * forma, costo e prezzo(uguale al doppio del costo).
 * 
 * Le funzioni richieste per il magazzino sono: - caricamento articoli in
 * magazzino; - stampa articoli presenti; - stampa costi totali; - stampa ricavi
 * totali;
 * 
 * Per la risoluzione dell'esercitazione si utilizzi correttamente
 * l'ereditarietà, il polimorfismo ed il binding dinamico dei metodi.
 */