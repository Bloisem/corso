package socialnetwork;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Predicate;

public class SocialNetworkFunction {
	List<Persona> persone = new ArrayList<>();

	public void addPersone(Persona ... args) {
		if (args != null) {
			for(Persona p: args) {
				persone.add(p);
			}
			
		}
	}

	public void inviaMessaggio(String messaggio, List<Persona> persone) {
		List<Persona> result = new ArrayList<>();
		persone.forEach(p -> System.out.println("Il messaggio '" + messaggio + "' è stato inviato a " + p));
	}

	public List<Persona> getPersone() {
		return persone;
	}

	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}

	public List<Persona> filtraCriterio(Ifiltrare fil) {
		List<Persona> result = new ArrayList<>();
		for (Persona p : persone) {
			if (fil.filtra(p)) {
				result.add(p);
			}

		}
		return result;

	}

	public List<Persona> filtraCriterioPredicate(Predicate<Persona> predic) {
		List<Persona> result = new ArrayList<>();
		for (Persona a : persone) {
			if (predic.test(a)) {
				result.add(a);
			}

		}
		return result;

	}

	public boolean test(Persona p) {
		return ((!p.getNazionalita().equals(Nazionalita.ITALIANA)) && p.getSesso().equals(Sesso.M));
	}
	
	

}
