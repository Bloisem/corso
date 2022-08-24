package cartoleria;

import java.util.ArrayList;


public class Magazzino implements FunzioniMagazzino{
	private String name;
	private ArrayList <Articolo> articoli;
	
	public Magazzino(String name) {
		this.name = name;
		this.articoli = new ArrayList<>();
	}

	public void caricamentoArticoli(Object ...art) {
		for(Object a:art) {
			if(a instanceof Articolo) {
				articoli.add((Articolo)a);
			}
		}
		
	}

	public String getName() {
		return name;
	}

	@Override
	public void stampaCostiTotali() {
		double sum= 0;
		for(Articolo a:articoli) {
			sum += a.getCosto();
		}
		System.out.println("Costi totali di "+name+": " + sum);
		
		
	}

	@Override
	public void stampaRicaviTotali() {
		double sum= 0;
		for(Articolo a:articoli) {
			sum += a.getPrezzo();
		}
		System.out.println("Ricavi totali di "+name+": " + sum);
		
		
	}

	@Override
	public void articoliPresenti() {
		for(Articolo a:articoli) {
			System.out.println(a);
		}
		
	}

	
	
	

}
